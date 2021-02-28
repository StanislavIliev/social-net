package socialnet.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import socialnet.exceptions.UserExistException;
import socialnet.models.servicies.UserServiceModel;

import java.util.List;

public interface UserService extends UserDetailsService {

    UserServiceModel register(UserServiceModel user) throws UserExistException;

    UserServiceModel resetPassword(UserServiceModel user);

    UserServiceModel update(UserServiceModel user);

    UserServiceModel confirmPassword(UserServiceModel user);

    List<UserServiceModel> getAllUser(UserServiceModel user);

    UserServiceModel getUserByUsername(String username);

    UserServiceModel getUserByEmail(String email);

}
