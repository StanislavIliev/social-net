package socialnet.web.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import socialnet.exceptions.PostDoesNotExistException;
import socialnet.exceptions.exceptionFolder.UserDoesNotExistException;
import socialnet.exceptions.exceptionFolder.UserExistException;
import socialnet.models.binding.PostBindingModel;
import socialnet.models.binding.UserRegisterBindingModel;
import socialnet.models.servicies.PostServiceModel;
import socialnet.models.servicies.UserServiceModel;
import socialnet.models.views.PostViewModel;
import socialnet.models.views.UserViewModel;
import socialnet.service.PostService;
import socialnet.service.UserService;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final ModelMapper modelMapper;
    private final PostService postService;

    @Autowired
    public UserController(UserService userService, ModelMapper modelMapper, PostService postService) {
        this.userService = userService;
        this.modelMapper = modelMapper;
		this.postService = postService;
    }

    @PostMapping(value = "/register")
    public ResponseEntity<UserViewModel> registerPost(@Valid @ModelAttribute UserRegisterBindingModel user)
            throws UserExistException, UserDoesNotExistException {
        UserServiceModel u = this.userService.register(this.modelMapper.map(user, UserServiceModel.class));
        UserViewModel rUser = this.modelMapper.map(u, UserViewModel.class);
        return new ResponseEntity<>(rUser, HttpStatus.OK);
    }
    
    @PostMapping(value = "/create-post")
    public ResponseEntity<String> createPost(@Valid @ModelAttribute PostBindingModel inputPost) throws UserDoesNotExistException {
        this.postService.createPost(this.modelMapper.map(inputPost, PostServiceModel.class));
        return new ResponseEntity<>("The post was created!", HttpStatus.OK);
    }
    
    @DeleteMapping(value = "/delete-post/{postId}")
    public ResponseEntity<Boolean> deletePost(@PathVariable String postId) throws UserDoesNotExistException, PostDoesNotExistException {
        boolean isDeleted = this.postService.deletePost(postId);
        return new ResponseEntity<>(isDeleted, HttpStatus.OK);
    }

}
