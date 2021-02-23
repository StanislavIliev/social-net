package socialnet.models.servicies;

import org.hibernate.validator.constraints.Length;
import socialnet.models.entities.Authority;

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
    private LocalDateTime registerDate;
    private Boolean isEnabled;
    private Integer phone;
    private String confirmLinkPassword;
    //    @OneToMany //TODO
//    private List<Message> messages;
    private List<Authority> authorities;

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

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getConfirmLinkPassword() {
        return confirmLinkPassword;
    }

    public void setConfirmLinkPassword(String confirmLinkPassword) {
        this.confirmLinkPassword = confirmLinkPassword;
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }
}
