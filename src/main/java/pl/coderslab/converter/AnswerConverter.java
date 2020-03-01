package pl.coderslab.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pl.coderslab.model.Answer;
import pl.coderslab.modelDto.AnswerDto;

@Service
public class AnswerConverter {
    private final ModelMapper modelMapper;

    public AnswerConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public AnswerDto convertToDto(Answer answer) {
        return modelMapper.map(answer, AnswerDto.class);
    }

    public Answer convertToEntity(AnswerDto answerDto) {
        return modelMapper.map(answerDto, Answer.class);
    }
}
