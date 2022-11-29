package com.authentication.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authentication.modals.Answers;
import com.authentication.repository.AnswerRepository;
import com.authentication.service.AswerService;

@Service
public class AswerServiceImpl implements AswerService{
	
	@Autowired
	private AnswerRepository ansRepo;

	@Override
	public Answers addAnswer(Answers ans) {
		// TODO Auto-generated method stub
		return this.ansRepo.save(ans);
	}
	@Override
	public ArrayList<Answers> getAnswer() {
		// TODO Auto-generated method stub
		return (ArrayList<Answers>) this.ansRepo.findAll();
	}
	

}
