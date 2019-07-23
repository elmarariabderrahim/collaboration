package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;





@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Reclamation implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String objet;
	private String message;
	private String pieceJointe;
	@ManyToOne 
	@JoinColumn(name="code_user")
	private User user;
	@OneToOne
	private EtatReclamation etatReclamation;
	
	
	
	

}
