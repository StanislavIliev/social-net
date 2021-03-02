package socialnet.models.binding;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;

public class UserBindingModel {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDateTime registerDate;
    private Boolean isEnabled;
    private String phone;
    private String confirmLinkPassword;
    //    @OneToMany //TODO
//    private List<Message> messages;
    private List<AuthorityBindingModel> authorities;

    public UserBindingModel() {
        super();
    }

    @Length(min = 5, max = 20, message = "Username must be between 5 and 20 characters")
    @NotBlank
    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    @Length(min = 6, max = 32, message = "Password must be between 6 and 32 characters")
    @NotBlank
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //  TODO  @Pattern()
    @NotBlank
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Length(min = 1, max = 40, message = "First name cannot be over 40 characters")
    @NotBlank(message = "First name cannot be empty")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Length(min = 1, max = 40, message = "Last name cannot be over 40 characters")
    @NotBlank(message = "Last name cannot be empty")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
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

    public List<AuthorityBindingModel> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<AuthorityBindingModel> authorities) {
        this.authorities = authorities;
    }
}
