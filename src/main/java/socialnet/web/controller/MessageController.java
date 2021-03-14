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
import socialnet.repository.MessageRepository;
import socialnet.repository.UserRepository;
import socialnet.service.MessageService;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final MessageService messageService;
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    private final MessageRepository messageRepository;

    @Autowired
    public MessageController(MessageService messageService,
                             ModelMapper modelMapper,
                             UserRepository userRepository,
                             MessageRepository messageRepository) {
        this.messageService = messageService;
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
        this.messageRepository = messageRepository;
    }

    @PostMapping(value = "/send-message")
    public ResponseEntity<MessageViewModel> sendMessage(@Valid @ModelAttribute MessageBindingModel message) {

        MessageServiceModel m = this.messageService.send(this.modelMapper.map(message, MessageServiceModel.class));
        MessageViewModel viewModel = this.modelMapper.map(m, MessageViewModel.class);
        this.userRepository.findById(message.getSenderId()).get().getSentMessages().add(m.getId());
        this.userRepository.findById(message.getRecipientId()).get().getReceivedMessages().add(m.getId());

        return new ResponseEntity<>(viewModel, HttpStatus.OK);
    }

    //TODO how to do delete message

//    @PostMapping(value = "/delete-message")
//    public void deleteMessage(@Valid @ModelAttribute MessageBindingModel m) {
//
//
//        this.userRepository.findById(m.getSenderId()).get().getDeletedMessages().add(m.getId());
//        this.userRepository.findById(m.getSenderId()).get().getSentMessages().remove(m.getId());
//    }

    @PostMapping(value = "/allMessages")
    public ResponseEntity<ArrayList<MessageViewModel>> allMessages(@Valid @ModelAttribute MessageViewModel allMessages) {

        //TODO how are we getting logged user ID?

        return null;
    }
}
