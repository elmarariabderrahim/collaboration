package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;





@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type",discriminatorType=DiscriminatorType.STRING,
length=5)
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class AutorisationSortie implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	private Date dateDebut;
	private Date dateFin;
	private Long duree;
	private Date dateDemmande;
	@ManyToOne
	@JoinColumn(name="code_user")
	private User user;
	
	
	
	
	

}
