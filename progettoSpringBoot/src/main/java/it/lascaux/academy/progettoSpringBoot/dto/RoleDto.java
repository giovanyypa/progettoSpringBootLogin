package it.lascaux.academy.progettoSpringBoot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleDto {

	private String nome ;
	
	private String descrizione;

}
