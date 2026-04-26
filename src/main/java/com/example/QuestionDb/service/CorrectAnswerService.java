package com.example.QuestionDb.service;

import com.example.QuestionDb.model.CorrectAnswer;
import com.example.QuestionDb.repository.CorrectAnswerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorrectAnswerService {

    private CorrectAnswerRepository correctAnswerRepository;

    public List<CorrectAnswer> getCorrectAnswersForQuestion(Long questionId) {
        return correctAnswerRepository.findByQuestionId(questionId);
    }

    public CorrectAnswer createCorrectAnswer(CorrectAnswer correctAnswer) {
        return correctAnswerRepository.save(correctAnswer);
    }
}
