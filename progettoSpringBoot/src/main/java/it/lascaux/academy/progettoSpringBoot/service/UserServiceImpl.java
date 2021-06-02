package it.lascaux.academy.progettoSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.lascaux.academy.progettoSpringBoot.dto.UserRequest;
import it.lascaux.academy.progettoSpringBoot.entity.User;
import it.lascaux.academy.progettoSpringBoot.repository.UserDao;



@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	@Override
	public User findUserByUsername(UserRequest user) {
		return userDao.findByUsername(user.getUsername());
	}
}
