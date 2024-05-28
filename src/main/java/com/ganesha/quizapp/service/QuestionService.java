package com.ganesha.quizapp.service;


import com.ganesha.quizapp.model.Question;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuestionService {
    public ResponseEntity<List<Question>> getAllQuestions();

    ResponseEntity<List<Question>> getAllQuestionsByCategory(String category);

    ResponseEntity<Object> addQuetion(Question question);

    ResponseEntity<String> deleteQuetion(int id);

    ResponseEntity<? extends Object> updateQuetion(Question question, int id);
}
