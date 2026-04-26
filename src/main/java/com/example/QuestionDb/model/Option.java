package com.example.QuestionDb.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Option {

    @Id
    @GeneratedValue
    private Long Id;

    private String  optionsText;

    @ManyToOne
    @JoinColumn(name = "question-id")
    private Question question;

    private Boolean isCorrect;
}
