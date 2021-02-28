package socialnet.models.servicies;

import org.hibernate.validator.constraints.Length;
import socialnet.models.entities.Authority;
import socialnet.models.entities.Message;
import socialnet.models.entities.User;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.List;

public class UserServiceModel extends BaseServiceModel {

    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private Boolean isEnabled;
    private String phone;
    private String confirmLinkPassword;
    private String role;
    private List<UserServiceModel> friends;
    private List<MessageServiceModel> messages;
    private List<AuthorityServiceModel> authorities;

    public UserServiceModel() {
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getConfirmLinkPassword() {
        return confirmLinkPassword;
    }

    public void setConfirmLinkPassword(String confirmLinkPassword) {
        this.confirmLinkPassword = confirmLinkPassword;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<UserServiceModel> getFriends() {
        return friends;
    }

    public void setFriends(List<UserServiceModel> friends) {
        this.friends = friends;
    }

    public List<MessageServiceModel> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageServiceModel> messages) {
        this.messages = messages;
    }

    public List<AuthorityServiceModel> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<AuthorityServiceModel> authorities) {
        this.authorities = authorities;
    }
}
