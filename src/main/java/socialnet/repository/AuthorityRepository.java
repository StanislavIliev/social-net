package socialnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import socialnet.models.entities.Authority;

import java.util.Optional;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority,String> {

    Optional<Authority> findByAuthority(String authority);

//    Authority getByRole(String roleName);
}
