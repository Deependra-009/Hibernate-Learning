package com.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authentication.modals.Answers;

@Repository
public interface AnswerRepository extends JpaRepository<Answers, Integer> {

}
