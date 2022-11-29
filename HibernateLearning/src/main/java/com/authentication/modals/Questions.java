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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="question_table")
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Questions {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;
	private String question;
		
	@OneToMany( cascade = CascadeType.ALL)
	@JoinColumn(name="answerId",referencedColumnName = "qid")
	private List<Answers> answers;
	
	
	
	
	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="answer_id")
//	private Answers answer;
	
	
	

}
