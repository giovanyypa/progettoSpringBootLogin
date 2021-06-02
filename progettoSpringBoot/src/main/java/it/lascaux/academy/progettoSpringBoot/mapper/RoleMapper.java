package it.lascaux.academy.progettoSpringBoot.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


import it.lascaux.academy.progettoSpringBoot.dto.RoleDto;
import it.lascaux.academy.progettoSpringBoot.entity.Role;

@Mapper(componentModel = "spring") 
public interface RoleMapper {
	
	@Mapping(source = "name",target = "nome")
	@Mapping(source = "description",target = "descrizione")
	RoleDto toDto(Role role);

}
