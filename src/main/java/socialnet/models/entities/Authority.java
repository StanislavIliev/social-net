package socialnet.models.entities;

import org.springframework.security.core.GrantedAuthority;
import socialnet.enums.RoleEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "authorities")
public class Authority extends BaseEntity implements GrantedAuthority{

    @Column(nullable = false, unique = true)
    private String role;

    public Authority(){

    }

    public Authority(String role) {
        this.role = role;
    }

    public Authority(String id, String role) {
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
