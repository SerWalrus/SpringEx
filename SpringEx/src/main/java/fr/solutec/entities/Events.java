package fr.solutec.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Events {
	@Id
	@GeneratedValue
	private Long Id;
	private String titre;
	private String description;
	private Date dateEvent;
	@ManyToOne
	private User users;
}
