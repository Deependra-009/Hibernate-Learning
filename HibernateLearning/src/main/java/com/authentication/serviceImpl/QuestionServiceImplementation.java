package com.authentication.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authentication.modals.Questions;
import com.authentication.repository.QuestionRepository;
import com.authentication.service.QuestionService;

@Service
public class QuestionServiceImplementation implements QuestionService {
	
	@Autowired
	private QuestionRepository qrepo;

	@Override
	public Questions addQuestion(Questions q) {
		// TODO Auto-generated method stub
		
		return qrepo.save(q);
		
		
	}

	@Override
	public ArrayList<Questions> getAllQuestions() {
		// TODO Auto-generated method stub
		return (ArrayList<Questions>) qrepo.findAll();
	}

}
