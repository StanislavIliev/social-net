package socialnet.service.impl;

import org.springframework.stereotype.Service;
import socialnet.repository.MessageRepository;
import socialnet.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }
}
