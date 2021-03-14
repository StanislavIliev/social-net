package socialnet.web.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import socialnet.models.binding.NewMessageBindingModel;
import socialnet.models.views.MessageViewModel;
import socialnet.repository.MessageRepository;
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
	
  	@PostMapping("/send-message")
  	public ResponseEntity<String> sendMessage (@Valid @ModelAttribute NewMessageBindingModel nmbm) {
  		// TODO
  		//return new ResponseEntity<>("OK", HttpStatus.CREATED);
  		return null;
  	}
  	
  	@GetMapping("/all-inbox/{userId}")
  	public ResponseEntity<List<MessageViewModel>> getAllInboxMessagesByUser (@PathVariable String userId) {
  		// TODO
  		//return new ResponseEntity<>(messages, HttpStatus.OK);
  		return null;
  	}
  	
  	@GetMapping("/all-sent/{userId}")
  	public ResponseEntity<List<MessageViewModel>> getAllSentMessagesByUser (@PathVariable String userId) {
  		// TODO
  		//return new ResponseEntity<>(messages, HttpStatus.OK);
  		return null;
  	}
  	
  	@GetMapping("/all-in-trash/{userId}")
  	public ResponseEntity<List<MessageViewModel>> getAllMessagesInTrashByUser (@PathVariable String userId) {
  		// TODO
  		//return new ResponseEntity<>(messages, HttpStatus.OK);
  		return null;
  	}
  	
  	@GetMapping("/all-inbox-new/{userId}")
  	public ResponseEntity<Integer> getNumberOfNewMessages(@PathVariable String userId) {
  		// TODO
  		//return new ResponseEntity<>(number, HttpStatus.OK);
  		return null;
  	}
  	
  	@GetMapping("/get/{messageId}")
  	public ResponseEntity<MessageViewModel> getMessageById(@PathVariable String messageId) {
  		// TODO
  		//return new ResponseEntity<>(message, HttpStatus.OK);
  		return null;
  	}
  	
  	@GetMapping("/all/{userId}")
  	public ResponseEntity<List<MessageViewModel>> getAllMessagesByUserId(@PathVariable String userId) {
  		// TODO
  		//return new ResponseEntity<>(messages, HttpStatus.OK);
  		return null;
  	}
  	
  	@GetMapping("/move-to-trash/{messageId}/{userId}")
  	public ResponseEntity<Boolean> moveMessageToTrash(@PathVariable String messageId, @PathVariable String userId) {
  		// TODO
  		//return new ResponseEntity<>(isMassageInTrash, HttpStatus.OK);
  		return null;
  	}
  	
  	@PostMapping("/set-status-to-read/{messageId}/{userId}" )
  	public ResponseEntity<Boolean> messageChancedToRead(@PathVariable String messageId, @PathVariable String userId) {
  		// TODO
  		//return new ResponseEntity<Boolean>(status, HttpStatus.OK);
  		return null;
  	}
}
