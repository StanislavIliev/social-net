package socialnet.models.servicies;


public class AuthorityServiceModel extends BaseServiceModel {

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
