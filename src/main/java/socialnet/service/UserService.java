package socialnet.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import socialnet.exceptions.exceptionFolder.UserDoesNotExistException;
import socialnet.exceptions.exceptionFolder.UserExistException;
import socialnet.models.servicies.UserServiceModel;

import java.util.List;

public interface UserService extends UserDetailsService {

    UserServiceModel register(UserServiceModel user) throws UserExistException, UserDoesNotExistException;

    void resetPassword(UserServiceModel user) throws UserDoesNotExistException;

    UserServiceModel update(UserServiceModel user);

    UserServiceModel confirmPassword(UserServiceModel user) throws UserDoesNotExistException;

    List<UserServiceModel> getAllUser(UserServiceModel user);

    UserServiceModel getUserByUsername(String username);

    UserServiceModel getUserByEmail(String email);



}
