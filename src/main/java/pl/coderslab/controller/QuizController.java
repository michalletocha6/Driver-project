package pl.coderslab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.converter.QuizConverter;
import pl.coderslab.model.Quiz;
import pl.coderslab.modelDto.QuizDto;
import pl.coderslab.service.QuizService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class QuizController {
    private final QuizService quizService;
    private final QuizConverter quizConverter;

    public QuizController(QuizService quizService, QuizConverter quizConverter) {
        this.quizService = quizService;
        this.quizConverter = quizConverter;
    }

    @GetMapping("/quizzes")
    public List<QuizDto> getQuizList() {
        List<Quiz> quizzes = quizService.readAllQuiz();
        return quizzes.stream().map(quizConverter::convertToDto).collect(Collectors.toList());
    }

    @GetMapping("/quiz/{id}")
    public QuizDto getQuiz(@PathVariable Long id) {
        return quizConverter.convertToDto(quizService.readQuiz(id));
    }

    @PostMapping("/createQuiz")
    public QuizDto createQuiz(@RequestBody QuizDto quizDto) {
        Quiz quiz = quizConverter.convertToEntity(quizDto);
        Quiz quizCreated = quizService.createQuiz(quiz);
        return quizConverter.convertToDto(quizCreated);
    }

    @GetMapping("/removeQuiz/{id}")
    public void removeQuiz(@PathVariable Long id) {
        quizService.deleteQuiz(quizService.readQuiz(id));
    }
}
