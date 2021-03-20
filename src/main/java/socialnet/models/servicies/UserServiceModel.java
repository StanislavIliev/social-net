package socialnet.models.servicies;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(description = "Details about the user service model.")
public class UserServiceModel extends BaseServiceModel {

    @ApiModelProperty(notes = "The username of the user.")
    private String username;
    @ApiModelProperty(notes = "The password of the user.")
    private String password;
    @ApiModelProperty(notes = "The email of the user.")
    private String email;
    @ApiModelProperty(notes = "The first name of the user.")
    private String firstName;
    @ApiModelProperty(notes = "The last name of the user.")
    private String lastName;
    @ApiModelProperty(notes = "Shows is enabled the account of the user.")
    private Boolean isEnabled;
    @ApiModelProperty(notes = "The phone of the user.")
    private String phone;
    @ApiModelProperty(notes = "The confirmation link of the user.")
    private String confirmLinkPassword;
    @ApiModelProperty(notes = "The list of friends of the user.")
    private List<UserServiceModel> friends;
    @ApiModelProperty(notes = "The received messages of the user.")
    private List<String> receivedMessages;
    @ApiModelProperty(notes = "The sent messages of the user.")
    private List<String> sentMessages;
    @ApiModelProperty(notes = "The deleted messages of the user.")
    private List<String> deletedMessages;

    private List<RoleServiceModel> roles;

    public UserServiceModel() {
        super();
    }

    public List<RoleServiceModel> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleServiceModel> roles) {
        this.roles = roles;
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

    public List<UserServiceModel> getFriends() {
        return friends;
    }

    public void setFriends(List<UserServiceModel> friends) {
        this.friends = friends;
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
