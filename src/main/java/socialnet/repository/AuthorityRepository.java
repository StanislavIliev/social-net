package socialnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import socialnet.models.entities.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority,String> {
    Authority getByRole(String roleName);
}
