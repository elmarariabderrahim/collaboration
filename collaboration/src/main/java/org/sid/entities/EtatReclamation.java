package org.sid.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;





@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class EtatReclamation implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	@OneToOne(mappedBy="etatReclamation",fetch=FetchType.LAZY)
	@JoinColumn(name="code_Rec")
	private Reclamation reclamation;
	
	
}
