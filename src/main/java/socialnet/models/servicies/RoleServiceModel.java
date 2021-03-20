package socialnet.models.servicies;

import socialnet.models.entities.Authority;

import java.util.List;

public class RoleServiceModel extends BaseServiceModel{

    private String name;
    private List<AuthorityServiceModel> authorities;

    public RoleServiceModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AuthorityServiceModel> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<AuthorityServiceModel> authorities) {
        this.authorities = authorities;
    }
}
