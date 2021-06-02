package it.lascaux.academy.progettoSpringBoot.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;

import it.lascaux.academy.progettoSpringBoot.entity.User;


@Repository
public interface UserDao  extends JpaRepository<User, Integer>{

	@EntityGraph(value = "it.lascaux.academy.progettoSpringboot.entities.User.graph.role" , type = EntityGraphType.LOAD)
	User findByUsername(String username);
}
