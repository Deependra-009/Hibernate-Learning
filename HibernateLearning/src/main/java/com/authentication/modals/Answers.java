package com.authentication.modals;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="answer_table")
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Answers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ansid;
		
	private String answer;
	
	@ManyToOne
	private Questions question;
	
//	@OneToOne(mappedBy="answer",cascade=CascadeType.ALL)
//	private Questions question;

	
}
