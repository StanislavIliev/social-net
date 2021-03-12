package socialnet.models.servicies;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Details about the authority service model.")
public class AuthorityServiceModel extends BaseServiceModel {

    @ApiModelProperty(notes = "The role of the authority.")
    private String role;

    public AuthorityServiceModel() {

    }

    public AuthorityServiceModel(String id, String role) {
        super(id);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
