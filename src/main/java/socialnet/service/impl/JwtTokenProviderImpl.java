package socialnet.service.impl;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;
import socialnet.models.entities.Role;
import socialnet.models.servicies.AuthorityServiceModel;
import socialnet.models.servicies.RoleServiceModel;
import socialnet.models.servicies.UserServiceModel;
import socialnet.service.JwtTokenProvider;

import javax.annotation.PostConstruct;
import javax.crypto.SecretKey;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Component
public class JwtTokenProviderImpl implements JwtTokenProvider {
    @Override
    public String createJwtToken(UserServiceModel usm) {
        return Jwts.builder()
                .setIssuer("me")
                .setSubject("pesho")
                .setAudience("you")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 60000))
                .setClaims(this.getClaims(usm))
                .signWith(createSecurityKey())
                .compact();//just an example id
    }

    private SecretKey createSecurityKey(){
        return Keys.secretKeyFor(SignatureAlgorithm.HS256);
    }

    @PostConstruct
    public void testToken(){
        UserServiceModel usm = new UserServiceModel();
        usm.setUsername("pesho");
        usm.setPassword("123456");
        RoleServiceModel roleServiceModel = new RoleServiceModel();
        roleServiceModel.setName("USER");
        roleServiceModel.setAuthorities(new ArrayList<>());
        usm.setRoles(new ArrayList<>());
        usm.getRoles().add(roleServiceModel);
        System.out.println(this.createJwtToken(usm));
    }



    private Map<String, RoleServiceModel> getClaims (UserServiceModel usm){
        Map<String, RoleServiceModel> claims = new HashMap<>();
        for (RoleServiceModel role : usm.getRoles()) {
            claims.put(role.getName(), role);
        }
        return claims;
    }

    @Override
    public List<GrantedAuthority> getAuthoritiesFromToken(String token) {
        return null;
    }

    @Override
    public boolean isTokenValid(String token, String username) {
        return false;
    }

    @Override
    public String getSubjectFromToken(String token) {
        return null;
    }

    @Override
    public Authentication getAuthentication(String username, List<GrantedAuthority> authorities, HttpServletRequest request) {
        return null;
    }

    @Override
    public String[] getClaimsFromUser(UserServiceModel usm) {
        return new String[0];
    }

    @Override
    public String[] getClaimsFromToken(String token) {
        return new String[0];
    }
}
