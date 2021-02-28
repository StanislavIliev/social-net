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

    private String authority;

    public Authority(){
    }

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
