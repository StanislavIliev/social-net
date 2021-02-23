package socialnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import socialnet.models.entities.AuthorityEntity;

@Repository
public interface AuthorityRepository extends JpaRepository<AuthorityEntity,String> {
    AuthorityEntity getByRole(String roleName);
}
