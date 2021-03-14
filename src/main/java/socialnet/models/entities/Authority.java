package socialnet.models.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "authorities")
@ApiModel(description = "Details about the authority.")
public class Authority extends BaseEntity implements GrantedAuthority{

    @ApiModelProperty(notes = "The name of the authority.")
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
