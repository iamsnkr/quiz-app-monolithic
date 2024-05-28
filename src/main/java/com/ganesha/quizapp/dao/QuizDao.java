package com.ganesha.quizapp.dao;

import com.ganesha.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
