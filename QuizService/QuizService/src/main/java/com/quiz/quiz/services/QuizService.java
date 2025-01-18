package com.quiz.quiz.services;

import com.quiz.quiz.entity.Quiz;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuizService {
    Quiz add(Quiz quiz);
    List<Quiz> getAll();
    Quiz get(Long id);
}
