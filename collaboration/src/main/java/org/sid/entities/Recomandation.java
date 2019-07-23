package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
//@DiscriminatorColumn(name="dType",discriminatorType=DiscriminatorType.STRING,
//length=5)
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Recomandation implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
	private String message;
	private String type;
	private String pieceJointe;
	@ManyToOne 
	@JoinColumn(name="code_user")
	private User user;

}
