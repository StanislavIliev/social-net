package socialnet.service.impl;

import org.springframework.stereotype.Service;
import socialnet.models.entities.User;
import socialnet.models.servicies.MessageServiceModel;
import socialnet.repository.MessageRepository;
import socialnet.service.MessageService;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public MessageServiceModel send(MessageServiceModel message) {
        return null;
    }

    @Override
    public List<MessageServiceModel> getAllByRecipient(User recipient) {
        return this.messageRepository.getAllByRecipient(recipient);
    }


    @Override
    public List<MessageServiceModel> getAllByStatus(MessageServiceModel status) {
        return null;
    }
}
