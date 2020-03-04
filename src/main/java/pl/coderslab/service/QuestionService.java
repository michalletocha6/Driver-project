package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.model.Question;
import pl.coderslab.repository.QuestionRepository;

import java.util.List;

@Service
public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }

    public Question readQuestion(Long id) {
        return questionRepository.findById(id).get();
    }

    public List<Question> readAllQuestions() {
        return questionRepository.findAll();
    }

    public void deleteQuestion(Question question) {
        questionRepository.delete(question);
    }
}
