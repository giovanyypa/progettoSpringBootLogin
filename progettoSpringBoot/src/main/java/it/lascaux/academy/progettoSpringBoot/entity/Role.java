package it.lascaux.academy.progettoSpringBoot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "profiles_roles")
public class Role implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1883109247260272239L;


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
}
