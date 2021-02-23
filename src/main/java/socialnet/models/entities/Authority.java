package socialnet.models.entities;

import org.springframework.security.core.GrantedAuthority;
import socialnet.enums.RoleEnum;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "authorities")
public class Authority extends BaseEntity {



}
