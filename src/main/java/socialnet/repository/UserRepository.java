package socialnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import socialnet.models.entities.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    
    Optional<User> findUsersByUsername(String username);

    Optional<User> findUsersByEmail(String username);

    Optional<User> findUserByConfirmLinkPassword(String linkname);

}
