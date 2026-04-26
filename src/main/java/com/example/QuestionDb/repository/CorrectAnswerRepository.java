package com.example.QuestionDb.repository;

import com.example.QuestionDb.model.CorrectAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CorrectAnswerRepository extends JpaRepository<CorrectAnswer, Long> {
    List<CorrectAnswer> findByQuestionId(Long questionId);
}
