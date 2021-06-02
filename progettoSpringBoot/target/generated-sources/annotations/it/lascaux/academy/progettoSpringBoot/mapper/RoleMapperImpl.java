package it.lascaux.academy.progettoSpringBoot.mapper;

import it.lascaux.academy.progettoSpringBoot.dto.RoleDto;
import it.lascaux.academy.progettoSpringBoot.dto.RoleDto.RoleDtoBuilder;
import it.lascaux.academy.progettoSpringBoot.entity.Role;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-02T12:16:49+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (Ubuntu)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public RoleDto toDto(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDtoBuilder roleDto = RoleDto.builder();

        roleDto.nome( role.getName() );
        roleDto.descrizione( role.getDescription() );

        return roleDto.build();
    }
}
