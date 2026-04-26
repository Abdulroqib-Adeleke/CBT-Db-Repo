package com.example.QuestionDb.controller;

import com.example.QuestionDb.model.Option;
import com.example.QuestionDb.service.OptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/options")
public class OptionController {

    private OptionService optionService;
    @GetMapping
    public List<Option> getOptionsForQuestion(@RequestParam Long questionId) {
        return optionService.getOptionsForQuestion(questionId);
    }

    @PostMapping
    public Option createOption(@RequestBody Option option) {
        return optionService.createOption(option);
    }
}