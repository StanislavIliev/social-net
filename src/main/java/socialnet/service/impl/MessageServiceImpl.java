package socialnet.service.impl;

import io.swagger.annotations.ApiModel;
import org.springframework.stereotype.Service;
import socialnet.models.servicies.MessageServiceModel;
import socialnet.models.views.MessageViewModel;
import socialnet.service.MessageService;

import java.time.LocalDateTime;
import java.util.List;

@Service
@ApiModel(description = "Details about methods in the message service.")
public class MessageServiceImpl implements MessageService {

//    private final MessageRepository messageRepository;
//    
//    @Autowired
//    public MessageServiceImpl(MessageRepository messageRepository) {
//        this.messageRepository = messageRepository;
//    }

    @Override
    public MessageServiceModel send(MessageServiceModel message) {

        //TODO
        return null;
    }

	@Override
	public List<MessageViewModel> getAllByReadStatus(boolean status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MessageViewModel> getAllByDateSent(LocalDateTime date) {
		// TODO Auto-generated method stub
		return null;
	}

//    @Override
//    public List<MessageViewModel> getAllByReadStatus(boolean status) {
//        return this.messageRepository.getAllByReadStatus(status);
//    }
//
//    @Override
//    public List<MessageViewModel> getAllByDateSent(LocalDateTime date) {
//        return this.messageRepository.getAllByDateSent(date);
//    }
}
