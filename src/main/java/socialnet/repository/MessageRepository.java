package socialnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import socialnet.models.entities.Message;

import socialnet.models.views.MessageViewModel;

import java.time.LocalDateTime;
import java.util.List;

public interface MessageRepository extends JpaRepository<Message, String> {

    List<MessageViewModel> getAllByReadStatus(boolean status);

    List<MessageViewModel> getAllByDateSent(LocalDateTime date);

    //TODO how to get the DATE for the method, what format does it comes?
}
