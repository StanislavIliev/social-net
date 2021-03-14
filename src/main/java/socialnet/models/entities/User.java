package socialnet.models.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
@ApiModel(description = "Details about the user.")
public class User extends BaseEntity {
	
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
	private LocalDateTime registerDate = LocalDateTime.now();
	@ApiModelProperty(notes = "The boolean is enabled the account of the user.")
	private Boolean isEnabled;
	@ApiModelProperty(notes = "The phone of the user.")
	private String phone;
	@ApiModelProperty(notes = "The confirmation link of the user.")
	private String confirmLinkPassword;
	@ApiModelProperty(notes = "The role of the user.")
	private String role;
	@ApiModelProperty(notes = "The list of the friends of the user.")
	private List<User> friends;
	@ApiModelProperty(notes = "The list of the received messages of the user.")
	private List<String> receivedMessages;
	@ApiModelProperty(notes = "The list of the sent messages of the user.")
	private List<String> sentMessages;
	@ApiModelProperty(notes = "The deleted messages of the user.")
	private List<String> deletedMessages;
	@ApiModelProperty(notes = "The authorities of the user.")
	private List<Authority> authorities;
	@ApiModelProperty(notes = "The posts of the user.")
	private List<Post> posts;

	public User() {
	}

	@OneToMany
	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Column(nullable = false, unique = true)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(nullable = false, unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "register_date", nullable = false)
    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    @Column(name = "is_enabled")
    public Boolean getEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    @Column(nullable = false, unique = true)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "confirm_link_password", unique = true)
    public String getConfirmLinkPassword() {
        return confirmLinkPassword;
    }

    public void setConfirmLinkPassword(String confirmLinkPassword) {
        this.confirmLinkPassword = confirmLinkPassword;
    }

    @OneToMany
    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @OneToMany
    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    @ElementCollection
    public List<String> getReceivedMessages() {
        return receivedMessages;
    }

    public void setReceivedMessages(List<String> receivedMessages) {
        this.receivedMessages = receivedMessages;
    }

    @ElementCollection
    public List<String> getSentMessages() {
        return sentMessages;
    }

    public void setSentMessages(List<String> sentMessages) {
        this.sentMessages = sentMessages;
    }

    @ElementCollection
    public List<String> getDeletedMessages() {
        return deletedMessages;
    }

    public void setDeletedMessages(List<String> deletedMessages) {
        this.deletedMessages = deletedMessages;
    }



}
