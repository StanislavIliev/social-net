package socialnet.models.auth;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import socialnet.models.entities.Authority;
import socialnet.models.entities.User;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserSpringDetails implements UserDetails {
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

    public UserSpringDetails(User user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.email = user.getEmail();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.registerDate = user.getRegisterDate();
        this.isEnabled = user.getEnabled();
        this.phone = user.getPhone();
        this.confirmLinkPassword = user.getConfirmLinkPassword();
        this.authorities = user.getAuthorities();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
//    TODO    return authorities.stream().map(role -> new SimpleGrantedAuthority(role.getAuthority()))
//                .collect(Collectors.toList());
        return null;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
