package pl.coderslab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.converter.QuestionConverter;
import pl.coderslab.model.Question;
import pl.coderslab.modelDto.QuestionDto;
import pl.coderslab.service.QuestionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class QuestionController {
    private final QuestionService questionService;
    private final QuestionConverter questionConverter;

    public QuestionController(QuestionService questionService, QuestionConverter questionConverter) {
        this.questionService = questionService;
        this.questionConverter = questionConverter;
    }

    @GetMapping("/questions")
    public List<QuestionDto> getQuestionList() {
        List<Question> questions = questionService.readAllQuestions();
        return questions.stream().map(questionConverter::convertToDto).collect(Collectors.toList());
    }

    @GetMapping("/question/{id}")
    public QuestionDto getQuestion(@PathVariable Long id) {
        return questionConverter.convertToDto(questionService.readQuestion(id));
    }

    @PostMapping("/createQuestion")
    public QuestionDto createQuestion(@RequestBody QuestionDto questionDto) {
        Question question = questionConverter.convertToEntity(questionDto);
        Question questionCreated = questionService.createQuestion(question);
        return questionConverter.convertToDto(questionCreated);
    }

    @GetMapping("/removeQuestion/{id}")
    public void removeQuestion(@PathVariable Long id) {
        questionService.deleteQuestion(questionService.readQuestion(id));
    }
}
