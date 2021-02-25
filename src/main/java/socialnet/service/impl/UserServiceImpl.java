package socialnet.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import socialnet.exceptions.UserExistException;
import socialnet.models.entities.User;
import socialnet.models.servicies.UserServiceModel;
import socialnet.repository.UserRepository;
import socialnet.service.UserService;
import socialnet.util.UserPrincipal;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    //

    @Override
    public UserServiceModel register(UserServiceModel inputUser) throws UserExistException {
        User user = this.userRepository.findUsersByEmail(inputUser.getEmail()).orElse(null);
        if (user != null) throw new UserExistException("User exist exception!");
        this.setRoleAndAuthorities(inputUser);
        this.setImagesToUser(inputUser);
        this.sendMessage();
        User sUser = this.saveUserToDb(inputUser);
        return this.modelMapper.map(sUser, UserServiceModel.class);
    }

    @Override
    public UserServiceModel resetPassword(UserServiceModel user) {
        return null;
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
        User user = this.userRepository
                .findUsersByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User does not exist exception!"));
        return new UserPrincipal(user);
    }
    // PRIVATE METHODS
    //==================================================================================================================

    private User saveUserToDb(UserServiceModel inputUser) {
        return null;
    }

    private void sendMessage() {

    }

    private void setImagesToUser(UserServiceModel inputUser) {

    }

    private void setRoleAndAuthorities(UserServiceModel inputUser) {

    }
}
