package com.example.QuestionDb.dto;

import lombok.Data;

import java.util.List;

@Data
public class QuestionRequestDto {

    private String questionText;
    private List<OptionDto> options;

}
