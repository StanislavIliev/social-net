package socialnet.models.binding;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;

@ApiModel(description = "Details about the user binding model.")
public class UserBindingModel extends BaseBindingModel {
    @ApiModelProperty(notes = "The username of the user. It must be unique.")
    private String username;
    @ApiModelProperty(notes = "The password of the user.")
    private String password;
    @ApiModelProperty(notes = "The email of the user. It must be unique.")
    private String email;
    @ApiModelProperty(notes = "The first name of the user.")
    private String firstName;
    @ApiModelProperty(notes = "The last name of the user.")
    private String lastName;
    @ApiModelProperty(notes = "The registration date of the user.")
    private LocalDateTime registerDate;
    @ApiModelProperty(notes = "The boolean is enabled the account of the user.")
    private Boolean isEnabled;
    @ApiModelProperty(notes = "The phone of the user.")
    private String phone;
    @ApiModelProperty(notes = "The confirmation link of the user.")
    private String confirmLinkPassword;
    @ApiModelProperty(notes = "The list of the received messages of the user.")
    private List<String> receivedMessages;
    @ApiModelProperty(notes = "The list of the sent messages of the user.")
    private List<String> sentMessages;
    @ApiModelProperty(notes = "The deleted messages of the user.")
    private List<String> deletedMessages;
    @ApiModelProperty(notes = "The authorities of the user.")
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

    @Email
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

    public List<String> getReceivedMessages() {
        return receivedMessages;
    }

    public void setReceivedMessages(List<String> receivedMessages) {
        this.receivedMessages = receivedMessages;
    }

    public List<String> getSentMessages() {
        return sentMessages;
    }

    public void setSentMessages(List<String> sentMessages) {
        this.sentMessages = sentMessages;
    }

    public List<String> getDeletedMessages() {
        return deletedMessages;
    }

    public void setDeletedMessages(List<String> deletedMessages) {
        this.deletedMessages = deletedMessages;
    }
}
