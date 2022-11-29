package com.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authentication.modals.Questions;

@Repository
public interface QuestionRepository extends JpaRepository<Questions, Integer>  {

}
