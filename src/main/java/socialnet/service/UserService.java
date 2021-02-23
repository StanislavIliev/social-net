package socialnet.service;

import socialnet.models.servicies.UserServiceModel;

import java.util.List;

public interface UserService {

    UserServiceModel register(UserServiceModel user);

    UserServiceModel resetPassword(UserServiceModel user);

    UserServiceModel update(UserServiceModel user);

    UserServiceModel confirmPassword(UserServiceModel user);

    List<UserServiceModel> getAllUser(UserServiceModel user);

    UserServiceModel getUserByUsername(String username);

    UserServiceModel getUserByEmail(String email);

}
