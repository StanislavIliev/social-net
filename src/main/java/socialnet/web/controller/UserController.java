package socialnet.web.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import socialnet.exceptions.UserExistException;
import socialnet.models.binding.UserRegisterBindingModel;
import socialnet.models.servicies.UserServiceModel;
import socialnet.models.views.UserViewModel;
import socialnet.service.UserService;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final ModelMapper modelMapper;

    @Autowired
    public UserController(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @PostMapping(value = "/register")
    public ResponseEntity<UserViewModel> registerPost(@Valid @ModelAttribute UserRegisterBindingModel user)
            throws UserExistException {
        UserServiceModel u = this.userService.register(this.modelMapper.map(user, UserServiceModel.class));
        UserViewModel rUser = this.modelMapper.map(u, UserViewModel.class);
        return new ResponseEntity<>(rUser, HttpStatus.OK);
    }

}
