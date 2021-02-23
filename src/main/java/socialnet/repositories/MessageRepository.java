package socialnet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import socialnet.models.entities.Message;
import socialnet.models.views.MessageViewModel;

import java.util.UUID;

public interface MessageRepository extends JpaRepository<Message, UUID> {

    //TODO
}
