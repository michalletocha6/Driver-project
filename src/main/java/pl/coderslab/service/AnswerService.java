package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.model.Answer;
import pl.coderslab.repository.AnswerRepository;

import java.util.List;

@Service
public class AnswerService {
    private final AnswerRepository answerRepository;

    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }


    public void createAnswer(Answer answer) {
        answerRepository.save(answer);
    }

    public Answer readAnswer(Long id) {
        return answerRepository.findById(id).get();
    }

    public List<Answer> readAllAnswers() {
        return answerRepository.findAll();
    }

    public void deleteAnswer(Answer answer) {
        answerRepository.delete(answer);
    }
}
