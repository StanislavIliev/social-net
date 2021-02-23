package socialnet.models.entities;

import org.springframework.security.core.GrantedAuthority;
import socialnet.enums.RoleEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "authorities")
public class AuthorityEntity extends BaseEntity implements GrantedAuthority{

    @Column(nullable = false, unique = true)
    private String role;

    public AuthorityEntity(){

    }

    public AuthorityEntity(String role) {
        this.role = role;
    }

    public AuthorityEntity(String id, String role) {
        super(id);
        this.role = role;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return this.role;
    }

}
