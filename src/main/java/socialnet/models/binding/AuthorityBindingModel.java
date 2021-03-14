package socialnet.models.binding;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Details about the authority.")
public class AuthorityBindingModel extends BaseBindingModel{

    @ApiModelProperty(notes = "The role of the authority.")
    private String role;

    public AuthorityBindingModel() {

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
