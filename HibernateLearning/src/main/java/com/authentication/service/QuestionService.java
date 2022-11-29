package com.authentication.service;

import java.util.ArrayList;

import com.authentication.modals.Questions;

public interface QuestionService {
	public Questions addQuestion(Questions q);
	public ArrayList<Questions> getAllQuestions();
}
