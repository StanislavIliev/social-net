package socialnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import socialnet.models.entities.Message;

import java.util.Optional;

public interface MessageRepository extends JpaRepository<Message, String> {

    Optional<Message> getAllByAuthor(String username);

    Optional<Message> getAllByRecipient(String recipient);

    //TODO
}
