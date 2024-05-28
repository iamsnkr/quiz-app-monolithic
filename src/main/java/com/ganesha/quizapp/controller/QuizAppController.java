package com.ganesha.quizapp.controller;


import com.ganesha.quizapp.model.Question;
import com.ganesha.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quizdata")
public class QuizAppController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/all-questions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return  questionService.getAllQuestions();
    }


    @GetMapping("/category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable(name = "category") String category){
        return  questionService.getAllQuestionsByCategory(category);
    }

    @PostMapping("/add")
    public ResponseEntity<Object> addQuestions(@RequestBody Question question){
       return questionService.addQuetion(question);

    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> addQuestions(@PathVariable(name = "id") int id){
        return questionService.deleteQuetion(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> addQuestions(@RequestBody Question question, @PathVariable(name = "id") int id){
        return questionService.updateQuetion(question, id);
    }


}
