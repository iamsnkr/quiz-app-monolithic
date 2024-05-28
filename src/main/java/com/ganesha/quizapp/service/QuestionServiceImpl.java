package com.ganesha.quizapp.service;

import com.ganesha.quizapp.model.Question;
import com.ganesha.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{
    @Autowired
    QuestionDao questionDao;

    @Override
    public ResponseEntity<List<Question>> getAllQuestions() {
        try {
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<List<Question>> getAllQuestionsByCategory(String category) {

        try {
            return new ResponseEntity<>(questionDao.findByCategory(category), HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<Object> addQuetion(Question question) {
        try {
            return new ResponseEntity<>(questionDao.save(question), HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
        }
        HashMap<String, String> hp = new HashMap<>();
        hp.put("category","Java/Python");
        hp.put("difficulty","Easy");
        hp.put("question","What is the data type for storing a single character in Java?");
        hp.put("option1","int");
        hp.put("option2","char");
        hp.put("option3","float");
        hp.put("option4","String");
        hp.put("answer","char");
        return new ResponseEntity<>(hp, HttpStatus.NOT_ACCEPTABLE);
    }

    @Override
    public ResponseEntity<String> deleteQuetion(int id) {
        if(questionDao.findById(id).isEmpty()){
            return new ResponseEntity<>("id : "+id+" not found", HttpStatus.NOT_FOUND);
        }else{

            questionDao.deleteById(id);
            return new ResponseEntity<>("success",HttpStatus.OK);
        }

    }

    @Override
    public ResponseEntity<? extends Object> updateQuetion(Question question, int id) {
        if(questionDao.findById(id).isEmpty()){
            return new ResponseEntity<>("id : "+id+" not found",HttpStatus.NOT_FOUND);
        }else {
            question.setId(id);
            return new ResponseEntity<>(questionDao.save(question), HttpStatus.OK);
        }
    }
}
