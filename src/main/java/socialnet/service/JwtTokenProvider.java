package socialnet.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import socialnet.models.servicies.UserServiceModel;

public interface JwtTokenProvider {

	String createJwtToken(UserServiceModel usm);
	
	List<GrantedAuthority> getAuthoritiesFromToken(String token);
	
	boolean isTokenValid(String token, String username);
	
	String getSubjectFromToken(String token);
	
	Authentication getAuthentication(String username, List<GrantedAuthority> authorities,HttpServletRequest request);

//	boolean isTokenExpired(String token, JWTVerifier jwtVerifier);

	String[] getClaimsFromUser(UserServiceModel usm);
	
	String[] getClaimsFromToken(String token);
	
//	JWTVerifier getJWTVerifier();
}
