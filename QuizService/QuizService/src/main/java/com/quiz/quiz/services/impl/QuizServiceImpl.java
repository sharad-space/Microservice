package com.quiz.quiz.services.impl;

import com.quiz.quiz.entity.Quiz;
import com.quiz.quiz.repo.QuizRepo;
import com.quiz.quiz.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {

    private QuizRepo quizRepo;


    public QuizServiceImpl(QuizRepo quizRepo) {
        this.quizRepo = quizRepo;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepo.save(quiz);
    }

    @Override
    public List<Quiz> getAll() {
        return quizRepo.findAll();
    }

    @Override
    public Quiz get(Long id) {
        return quizRepo.findById(id).orElseThrow(()->new RuntimeException("Quiz not Found"));
    }
}
