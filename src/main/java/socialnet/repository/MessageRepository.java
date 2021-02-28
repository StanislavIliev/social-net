package socialnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import socialnet.models.entities.Message;
import socialnet.models.entities.User;
import socialnet.models.servicies.MessageServiceModel;

import java.util.List;
import java.util.Optional;

public interface MessageRepository extends JpaRepository<Message, String> {

    Optional<Message> getAllByAuthor(String username);

    List<MessageServiceModel> getAllByRecipient(User recipient);

    //TODO
}
