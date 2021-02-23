package socialnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import socialnet.models.entities.Message;
import socialnet.models.views.MessageViewModel;

import java.util.UUID;

public interface MessageRepository extends JpaRepository<Message, UUID> {

    //TODO
}
