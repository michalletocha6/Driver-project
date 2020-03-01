package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.model.Quiz;
import pl.coderslab.repository.QuizRepository;

import java.util.List;

@Service
public class QuizService {
    private final QuizRepository quizRepository;

    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public void createQuiz(Quiz quiz) {
        quizRepository.save(quiz);
    }

    public Quiz readQuiz(Long id) {
        return quizRepository.findById(id).get();
    }

    public List<Quiz> readAllQuiz() {
        return quizRepository.findAll();
    }

    public void deleteQuiz(Quiz quiz) {
        quizRepository.delete(quiz);
    }
}
