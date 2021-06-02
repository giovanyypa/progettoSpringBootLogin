package it.lascaux.academy.progettoSpringBoot.controller;

import java.security.Principal;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.lascaux.academy.progettoSpringBoot.dto.UserDto;
import it.lascaux.academy.progettoSpringBoot.dto.UserRequest;
import it.lascaux.academy.progettoSpringBoot.facade.UserFacade;
import it.lascaux.academy.progettoSpringBoot.utils.JwtTokenUtil;




@RestController
@RequestMapping("/auth")

public class UserController {
	
	@Autowired 
	private UserFacade facade;


	 @Autowired 
	 private JwtTokenUtil jwtUtil;
	 
	
	@RolesAllowed({"admin", "user"})
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public ResponseEntity<?> getUserByUsernameAndPassword(@RequestHeader String Authorization,Principal principal){
		
			String username = this.jwtUtil.getUsernameFromKeyCloakToken(principal);
		

			UserDto userDto  = facade.findByUsername(new UserRequest(username));
			
			if(userDto != null) { 
				return ResponseEntity.ok(userDto);
			}
		
			else 
				return ResponseEntity.notFound().build();	
		
	}
	

}
