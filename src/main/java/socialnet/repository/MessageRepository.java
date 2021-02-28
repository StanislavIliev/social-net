package socialnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import socialnet.models.entities.Message;
import socialnet.models.entities.User;
import socialnet.models.servicies.MessageServiceModel;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, String> {

    List<MessageServiceModel> getAllByAuthor(User username);

    List<MessageServiceModel> getAllByRecipient(User recipient);

    List<MessageServiceModel> getAllByStatus(Boolean status);

    //TODO
}
