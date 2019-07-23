package org.sid.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;





@Entity
@DiscriminatorValue("R")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Repot extends AutorisationSortie  {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String motif;
	
	
}
