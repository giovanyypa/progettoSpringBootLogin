package it.lascaux.academy.progettoSpringBoot.mapper;



import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import it.lascaux.academy.progettoSpringBoot.dto.UserDto;
import it.lascaux.academy.progettoSpringBoot.entity.User;



@Mapper(componentModel = "spring",uses = {RoleMapper.class})
public interface UserMapper {
	

	@Mapping(source = "user.gender" , target = "gender")
	UserDto toDto(User user);
}
