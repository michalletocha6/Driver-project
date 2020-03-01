package pl.coderslab.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pl.coderslab.model.Question;
import pl.coderslab.modelDto.QuestionDto;

@Service
public class QuestionConverter {
    private final ModelMapper modelMapper;

    public QuestionConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public QuestionDto convertToDto(Question question) {
        return modelMapper.map(question, QuestionDto.class);
    }

    public Question convertToEntity(QuestionDto questionDto) {
        return modelMapper.map(questionDto, Question.class);
    }
}
