package com.example.QuestionDb.controller;

import com.example.QuestionDb.model.CorrectAnswer;
import com.example.QuestionDb.service.CorrectAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/correct-answers")
public class CorrectAnswerController {

    private CorrectAnswerService correctAnswerService;

    @GetMapping
    public List<CorrectAnswer> getCorrectAnswersForQuestion(@RequestParam Long questionId) {
        return correctAnswerService.getCorrectAnswersForQuestion(questionId);
    }

    @PostMapping
    public CorrectAnswer createCorrectAnswer(@RequestBody CorrectAnswer correctAnswer) {
        return correctAnswerService.createCorrectAnswer(correctAnswer);
    }
}
