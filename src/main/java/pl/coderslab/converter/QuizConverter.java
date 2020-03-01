package pl.coderslab.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pl.coderslab.model.Quiz;
import pl.coderslab.modelDto.QuizDto;

@Service
public class QuizConverter {
    private final ModelMapper modelMapper;

    public QuizConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public QuizDto convertToDto(Quiz quiz) {
        return modelMapper.map(quiz, QuizDto.class);
    }

    public Quiz convertToEntity(QuizDto quizDto) {
        return modelMapper.map(quizDto, Quiz.class);
    }
}
