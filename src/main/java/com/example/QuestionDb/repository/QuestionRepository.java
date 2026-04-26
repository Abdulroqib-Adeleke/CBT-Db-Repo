package com.example.QuestionDb.repository;

import com.example.QuestionDb.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
