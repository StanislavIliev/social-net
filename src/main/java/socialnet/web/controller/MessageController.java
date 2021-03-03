package socialnet.web.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import socialnet.models.binding.MessageBindingModel;
import socialnet.models.servicies.MessageServiceModel;
import socialnet.models.views.MessageViewModel;
import socialnet.repository.UserRepository;
import socialnet.service.MessageService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final MessageService messageService;
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    @Autowired
    public MessageController(MessageService messageService,
                             ModelMapper modelMapper,
                             UserRepository userRepository) {
        this.messageService = messageService;
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    @PostMapping(value = "/sendMessage")
    public ResponseEntity<MessageViewModel> sendMessage(@Valid @ModelAttribute MessageBindingModel message) {

        MessageServiceModel m = this.messageService.send(this.modelMapper.map(message, MessageServiceModel.class));
        MessageViewModel viewModel = this.modelMapper.map(m, MessageViewModel.class);

        return new ResponseEntity<>(viewModel, HttpStatus.OK);
    }

    @PostMapping(value = "/allMessages")
    public ResponseEntity<List> allMessages(@Valid @ModelAttribute MessageViewModel allMessages){

        //TODO how are we getting logged user ID?

        return null;
    }
}
