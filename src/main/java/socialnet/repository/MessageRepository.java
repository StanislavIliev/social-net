package socialnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import socialnet.models.entities.Message;

import socialnet.models.views.MessageViewModel;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, String> {

    List<MessageViewModel> getAllByReadStatus(boolean status);

    //List<MessageViewModel> getAllByDateSent(LocalDateTime date);

    //TODO how to get the DATE for the method, what format does it comes?
}
