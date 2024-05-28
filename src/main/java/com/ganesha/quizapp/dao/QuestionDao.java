package com.ganesha.quizapp.dao;

import com.ganesha.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
    @Override
    List<Question> findAll();

    List<Question> findByCategory(String category);

    @Query(nativeQuery = true, value = "SELECT * FROM question q WHERE q.category=:category ORDER BY RAND() LIMIT :numQ")
    List<com.ganesha.quizapp.model.Question> findRandomQuestionsByCategory(String category, int numQ);
}
