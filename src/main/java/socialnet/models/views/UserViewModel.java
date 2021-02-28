package socialnet.models.views;

import socialnet.models.entities.Authority;
import socialnet.models.entities.Message;
import socialnet.models.entities.User;

import java.time.LocalDateTime;
import java.util.List;

public class UserViewModel extends BaseViewModel{

    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDateTime registerDate;
    private Boolean isEnabled;
    private String phone;
    private String confirmLinkPassword;
    private String role;
    private List<User> friends;
    private List<Message> messages;
    private List<Authority> authorities;
}
