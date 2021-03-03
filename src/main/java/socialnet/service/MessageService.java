package socialnet.service;

import socialnet.models.servicies.MessageServiceModel;
import socialnet.models.views.MessageViewModel;

import java.time.LocalDateTime;
import java.util.List;

public interface MessageService {

    MessageServiceModel send(MessageServiceModel message);

    List<MessageViewModel> getAllByReadStatus(boolean status);

    List<MessageViewModel> getAllByDateSent(LocalDateTime date);

}
