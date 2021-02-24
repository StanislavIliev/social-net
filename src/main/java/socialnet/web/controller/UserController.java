package socialnet.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import socialnet.models.binding.UserRegisterBindingModel;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/register")
    public ResponseEntity<String> register(@Valid @ModelAttribute UserRegisterBindingModel user){
        //todo
        return new ResponseEntity<>("", HttpStatus.OK);
    }

}
