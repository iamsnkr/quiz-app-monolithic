package com.ganesha.quizapp.service;

import com.ganesha.quizapp.dao.QuestionDao;
import com.ganesha.quizapp.dao.QuizDao;
import com.ganesha.quizapp.model.Question;
import com.ganesha.quizapp.model.QuestionWrapper;
import com.ganesha.quizapp.model.Quiz;
import com.ganesha.quizapp.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizSerivce {

    @Autowired
    QuizDao quizDao;

    @Autowired
    QuestionDao questionDao;

    @Override
    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

        List<Question> questions = questionDao.findRandomQuestionsByCategory(category, numQ);
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<?> getQuizById(int id) {

        try {
            List<Question> questions = getListOfQuestions(id);
            List<QuestionWrapper> questionWrappers = questions
                    .stream().map(question -> {
                        QuestionWrapper questionWrapper = new QuestionWrapper(
                                question.getId(),
                                question.getQuestion(),
                                question.getOption1(),
                                question.getOption2(),
                                question.getOption3(),
                                question.getOption4());
                        return questionWrapper;
                    }).toList();
            return new ResponseEntity<>(questionWrappers, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>("no quiz found with id {" + id + "}", HttpStatus.NOT_FOUND);
        }


    }

    @Override
    public ResponseEntity<String> claculateResult(int id, List<Response> responses) {
        List<Question> questions;
        try {
            questions = getListOfQuestions(id);
        } catch (Exception e) {
            return new ResponseEntity<>("no quiz found with id {" + id + "}", HttpStatus.NOT_FOUND);
        }
        int resultCount = 0;

        responses.stream().forEach(System.out::println);

        System.out.println(questions);

        for (Response response : responses) {


            int count = (int) questions.stream()
                    .filter(question ->
                            question.getId() == response.getId()
                                     &&
                            question.getAnswer()
                                    .equalsIgnoreCase(response.getResponse())).count();
            System.out.println(count);
            if (count >= 1) {
                resultCount++;
            }
        }
        return new ResponseEntity<>("Quiz score for the quiz id {" + id + "} is : " + resultCount, HttpStatus.OK);
    }


    public List<Question> getListOfQuestions(int id) {

        return quizDao.findById(id).orElseThrow().getQuestions();
    }


}
