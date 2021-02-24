package socialnet.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import socialnet.models.servicies.UserServiceModel;

import java.util.List;

public interface UserService extends UserDetailsService {

    UserServiceModel register(UserServiceModel user);

    UserServiceModel resetPassword(UserServiceModel user);

    UserServiceModel update(UserServiceModel user);

    UserServiceModel confirmPassword(UserServiceModel user);

    List<UserServiceModel> getAllUser(UserServiceModel user);

    UserServiceModel getUserByUsername(String username);

    UserServiceModel getUserByEmail(String email);

}
