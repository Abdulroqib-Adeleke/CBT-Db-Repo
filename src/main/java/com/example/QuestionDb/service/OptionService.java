package com.example.QuestionDb.service;

import com.example.QuestionDb.model.Option;
import com.example.QuestionDb.repository.OptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionService {


    private OptionRepository optionRepository;

    public List<Option> getOptionsForQuestion(Long questionId) {
        return optionRepository.findByQuestionId(questionId);
    }

    public Option createOption(Option option) {
        return optionRepository.save(option);
    }

}
