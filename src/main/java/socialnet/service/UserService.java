package socialnet.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import socialnet.exceptions.UserDoesNotExistException;
import socialnet.exceptions.UserExistException;
import socialnet.models.servicies.UserServiceModel;

import java.util.List;

public interface UserService extends UserDetailsService {

    UserServiceModel register(UserServiceModel user) throws UserExistException;

    void resetPassword(UserServiceModel user) throws UserDoesNotExistException;

    UserServiceModel update(UserServiceModel user);

    UserServiceModel confirmPassword(UserServiceModel user) throws UserDoesNotExistException;

    List<UserServiceModel> getAllUser(UserServiceModel user);

    UserServiceModel getUserByUsername(String username);

    UserServiceModel getUserByEmail(String email);

}
