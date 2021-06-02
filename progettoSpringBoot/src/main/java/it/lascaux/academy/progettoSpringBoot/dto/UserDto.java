package it.lascaux.academy.progettoSpringBoot.dto;

import java.time.LocalDate;

import it.lascaux.academy.progettoSpringBoot.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
	
	private String firstname;
	private String lastname;
	private String username;
	private String fiscalcode;
	private String address;
	private LocalDate birthdate;
	private String citizenship;
	private Gender gender;
	private RoleDto role;

}
