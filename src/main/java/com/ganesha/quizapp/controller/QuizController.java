package com.ganesha.quizapp.controller;

import com.ganesha.quizapp.model.Response;
import com.ganesha.quizapp.service.QuizSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    QuizSerivce quizService;

    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(@RequestParam String category,
                                             @RequestParam int numQ,
                                             @RequestParam String title ){
        return quizService.createQuiz(category, numQ, title);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> createQuiz(@PathVariable int id){
        return quizService.getQuizById(id);
    }

    @PostMapping("/submit/{id}")
    public ResponseEntity<String> submitQuiz(@PathVariable int id, @RequestBody List<Response> responses){

        return quizService.claculateResult(id, responses);

    }

}


