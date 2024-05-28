package com.ganesha.quizapp.service;

import com.ganesha.quizapp.model.Response;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuizSerivce {
    ResponseEntity<String> createQuiz(String category, int numQ, String title);

    ResponseEntity<?> getQuizById(int id);

    ResponseEntity<String> claculateResult(int id, List<Response> responses);
}
