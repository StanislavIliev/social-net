package socialnet.service;

import socialnet.models.entities.User;
import socialnet.models.servicies.MessageServiceModel;

import java.util.List;

public interface MessageService {

    MessageServiceModel send(MessageServiceModel message);

    List<MessageServiceModel> getAllByRecipient(User recipient);
    List<MessageServiceModel> getAllByStatus(MessageServiceModel status);


}
