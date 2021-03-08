package socialnet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import socialnet.models.entities.User;
import socialnet.models.servicies.MessageServiceModel;
import socialnet.models.views.MessageViewModel;
import socialnet.repository.MessageRepository;
import socialnet.repository.UserRepository;
import socialnet.service.MessageService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public MessageServiceModel send(MessageServiceModel message) {

        //TODO
        return null;
    }

    @Override
    public List<MessageViewModel> getAllByReadStatus(boolean status) {
        return this.messageRepository.getAllByReadStatus(status);
    }

    @Override
    public List<MessageViewModel> getAllByDateSent(LocalDateTime date) {
        return this.messageRepository.getAllByDateSent(date);
    }
}
