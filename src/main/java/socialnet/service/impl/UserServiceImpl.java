package socialnet.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import socialnet.models.servicies.UserServiceModel;
import socialnet.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserServiceModel register(UserServiceModel user) {
        return null;
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
        return null;
    }
}
