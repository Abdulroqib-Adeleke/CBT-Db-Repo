package com.example.QuestionDb.service;

import com.example.QuestionDb.model.Question;
import com.example.QuestionDb.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuestionService {


    private QuestionRepository questionRepository;

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }
    //Comment
}
