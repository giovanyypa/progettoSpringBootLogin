package it.lascaux.academy.progettoSpringBoot.mapper;

import it.lascaux.academy.progettoSpringBoot.dto.UserDto;
import it.lascaux.academy.progettoSpringBoot.dto.UserDto.UserDtoBuilder;
import it.lascaux.academy.progettoSpringBoot.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-02T12:16:49+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.11 (Ubuntu)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDtoBuilder userDto = UserDto.builder();

        userDto.gender( user.getGender() );
        userDto.firstname( user.getFirstname() );
        userDto.lastname( user.getLastname() );
        userDto.username( user.getUsername() );
        userDto.fiscalcode( user.getFiscalcode() );
        userDto.address( user.getAddress() );
        userDto.birthdate( user.getBirthdate() );
        userDto.citizenship( user.getCitizenship() );
        userDto.role( roleMapper.toDto( user.getRole() ) );

        return userDto.build();
    }
}
