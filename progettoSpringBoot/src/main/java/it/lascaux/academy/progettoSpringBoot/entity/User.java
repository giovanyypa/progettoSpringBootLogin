package it.lascaux.academy.progettoSpringBoot.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedEntityGraphs;
import javax.persistence.Table;

import it.lascaux.academy.progettoSpringBoot.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "profiles")

@NamedEntityGraphs({
	@NamedEntityGraph(
			name = "it.lascaux.academy.progettoSpringboot.entities.User.graph.role",
			attributeNodes = @NamedAttributeNode("role")
			
			)
})

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9157202817494650024L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name ="firstname" )
	private String firstname;
	
	@Column(name ="lastname" )
	private String lastname;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;

	
	@Column(name = "fiscalcode")
	private String fiscalcode;
	
	@Column(name = "citizenship")
	private String citizenship;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "birthdate")
	private LocalDate birthdate;
	
	@Column(name ="gender" )
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_roles")
	private Role role;
	
}
