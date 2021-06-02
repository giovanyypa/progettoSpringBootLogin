package it.lascaux.academy.progettoSpringBoot.utils;

import java.io.Serializable;
import java.security.Principal;


import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.keycloak.representations.AccessToken;
import org.springframework.stereotype.Component;





@Component
public class JwtTokenUtil implements Serializable {

	
	/**
	 * 
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = 3496023406282056359L;

	public String getUsernameFromKeyCloakToken(Principal principal) {
		
		if (principal != null && principal instanceof KeycloakAuthenticationToken) { 
			KeycloakAuthenticationToken keycloakAuthenticationToken = (KeycloakAuthenticationToken) principal;
	        AccessToken accessToken = keycloakAuthenticationToken.getAccount().getKeycloakSecurityContext().getToken();
		    
		    String username = accessToken.getPreferredUsername();
		    
		    return username;
		} 
		else {
			return null;
		}
	}
    
    


}