package com.authentication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.authentication.modals.Answers;
import com.authentication.modals.Questions;
import com.authentication.serviceImpl.AswerServiceImpl;
import com.authentication.serviceImpl.QuestionServiceImplementation;

@RestController
public class Controller {
	
	@Autowired
	private QuestionServiceImplementation qservice;
	
	@Autowired
	private AswerServiceImpl ansService;
	
	@GetMapping("/test")
	public String test() {
		return "test successfull";
	}
	
	@PostMapping("/add-question")
	public Questions addQuestion(@RequestBody Questions q1) {
		
		return this.qservice.addQuestion(q1);
		
		
	}
	@GetMapping("/get-question")
	public ArrayList<Questions> getAllQuestion() {
		
		return this.qservice.getAllQuestions();
		
		
	}
	
	@PostMapping("/add-answer")
	public Answers addAnswer(@RequestBody Answers ans) {
//		System.out.println(ans.toString());
		return this.ansService.addAnswer(ans);
		
		
	}
	@GetMapping("/get-answer")
	public ArrayList<Answers> getAllAnswer() {
		
		return this.ansService.getAnswer();
		
		
	}

}
