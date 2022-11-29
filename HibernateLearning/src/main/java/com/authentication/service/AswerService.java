package com.authentication.service;

import java.util.ArrayList;

import com.authentication.modals.Answers;

public interface AswerService {
	
	public Answers addAnswer(Answers ans);
	public ArrayList<Answers> getAnswer();
}
