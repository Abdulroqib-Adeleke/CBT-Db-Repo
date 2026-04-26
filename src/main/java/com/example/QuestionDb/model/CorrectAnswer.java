package com.example.QuestionDb.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CorrectAnswer {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @ManyToOne
    @JoinColumn(name = "option_id")
    private Option option;
}
