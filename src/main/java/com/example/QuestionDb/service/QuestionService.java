package com.example.QuestionDb.service;

import com.example.QuestionDb.dto.QuestionRequestDto;
import com.example.QuestionDb.model.Option;
import com.example.QuestionDb.model.Question;
import com.example.QuestionDb.repository.QuestionRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    public Question createQuestion(@Valid QuestionRequestDto dto) {

        Question save = questionRepository.save(mapToQuestion(dto));

        return save;

    }

    private Question mapToQuestion(QuestionRequestDto dto){
        Question question = new Question();
        question.setQuestionText(dto.getQuestionText());

        List<Option> options = dto.getOptions().stream().map(optDto -> {
            Option option = new Option();
            option.setOptionsText(optDto.getOptionText());
            option.setIsCorrect(optDto.getIsCorrect());
            option.setQuestion(question);
            return option;
        }).toList();

        question.setOptions(options);

        return question;
    }
}
