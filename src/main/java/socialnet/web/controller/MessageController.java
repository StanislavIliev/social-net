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
import socialnet.service.MessageService;

import javax.validation.Valid;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final MessageService messageService;
    private final ModelMapper modelMapper;

    @Autowired
    public MessageController(MessageService messageService,
                             ModelMapper modelMapper) {
        this.messageService = messageService;
        this.modelMapper = modelMapper;
    }

    @PostMapping(value = "/sendMessage")
    public ResponseEntity<MessageViewModel> sendMessage(@Valid @ModelAttribute MessageBindingModel message) {

        MessageServiceModel m = this.messageService.send(this.modelMapper.map(message, MessageServiceModel.class));
        MessageViewModel viewModel = this.modelMapper.map(m, MessageViewModel.class);

        return new ResponseEntity<>(viewModel, HttpStatus.OK);
    }
}
