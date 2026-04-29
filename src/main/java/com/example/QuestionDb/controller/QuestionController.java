package com.example.QuestionDb.controller;

import com.example.QuestionDb.dto.QuestionRequestDto;
import com.example.QuestionDb.model.Question;
import com.example.QuestionDb.service.QuestionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @PostMapping
    public ResponseEntity<Question> create(@RequestBody @Valid  QuestionRequestDto dto) {
        return ResponseEntity.ok(questionService.createQuestion(dto));
    }
}
