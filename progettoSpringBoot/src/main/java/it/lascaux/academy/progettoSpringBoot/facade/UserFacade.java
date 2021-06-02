package it.lascaux.academy.progettoSpringBoot.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.lascaux.academy.progettoSpringBoot.dto.UserDto;
import it.lascaux.academy.progettoSpringBoot.dto.UserRequest;
import it.lascaux.academy.progettoSpringBoot.entity.User;
import it.lascaux.academy.progettoSpringBoot.mapper.UserMapper;
import it.lascaux.academy.progettoSpringBoot.service.UserService;

@Component
public class UserFacade {
	
	@Autowired
	private UserService service;
	
	@Autowired
	private UserMapper mapper;
	
	
	public UserDto findByUsername(UserRequest request) {
		
		User user = service.findUserByUsername(request);
		
		return mapper.toDto(user);
	}
	

}
