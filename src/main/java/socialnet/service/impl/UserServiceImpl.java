package socialnet.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import socialnet.exceptions.UserExistException;
import socialnet.models.entities.Authority;
import socialnet.models.entities.User;
import socialnet.models.servicies.UserServiceModel;
import socialnet.repository.AuthorityRepository;
import socialnet.repository.UserRepository;
import socialnet.service.UserService;
import socialnet.util.UserPrincipal;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final AuthorityRepository authorityRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper,
                           AuthorityRepository authorityRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.authorityRepository = authorityRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    //

    @Override
    public UserServiceModel register(UserServiceModel inputUser) throws UserExistException {
        User fUser = this.userRepository.findUsersByEmail(inputUser.getEmail()).orElse(null);
        if (fUser != null) throw new UserExistException("User exist exception!");
        User newUser = this.modelMapper.map(inputUser, User.class);
        this.setRoleAndAuthorities(newUser);
        this.setImagesToUser(newUser);
        this.sendMessage();
        User sUser = this.saveUserToDb(newUser);
        if (sUser != null){
            return this.modelMapper.map(sUser, UserServiceModel.class);
        }
        return null;
    }

    @Override
    public UserServiceModel resetPassword(UserServiceModel user) {
        String uniqueString = user.getConfirmLinkPassword();
        String password = user.getPassword();

        User foundUser = this.userRepository.findUserByConfirmLinkPassword(uniqueString).orElse(null);

        if(foundUser == null){
            throw new UsernameNotFoundException("User not found");
        }
        foundUser.setPassword(this.bCryptPasswordEncoder.encode(password));
        foundUser.setConfirmLinkPassword(" ");

        this.userRepository.saveAndFlush(foundUser);
        return this.modelMapper.map(foundUser,UserServiceModel.class);
    }

    @Override
    public UserServiceModel update(UserServiceModel user) {
        return null;
    }

    @Override
    public UserServiceModel confirmPassword(UserServiceModel user) {
        return null;
    }

    @Override
    public List<UserServiceModel> getAllUser(UserServiceModel user) {
        return null;
    }

    @Override
    public UserServiceModel getUserByUsername(String username) {
        return null;
    }

    @Override
    public UserServiceModel getUserByEmail(String email) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userRepository.findUsersByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User does not exist exception!"));
        return new UserPrincipal(user);
    }
    // PRIVATE METHODS
    //==================================================================================================================

    private User saveUserToDb(User user) {
        if (user != null){
            return this.userRepository.saveAndFlush(user);
        }
        return null;
    }

    private void sendMessage() {
        //todo
    }

    private void setImagesToUser(User user) {
        //todo
    }

    private void setRoleAndAuthorities(User user) {
        if (this.userRepository.count() == 0) {
            user.setRole("ADMIN");
            List<Authority> aaa = this.authorityRepository.findAll();
            user.setAuthorities(aaa);
        } else {
            user.setRole("USER");
            List<Authority> authorities = new ArrayList<>();
            Authority authority = this.authorityRepository.findByAuthority("ROLE_USER").orElse(null);
            authorities.add(authority);
            user.setAuthorities(authorities);
        }
    }
}
