package it.lascaux.academy.progettoSpringBoot.service;

import it.lascaux.academy.progettoSpringBoot.dto.UserRequest;
import it.lascaux.academy.progettoSpringBoot.entity.User;

public interface UserService {

	User findUserByUsername(UserRequest user);

}