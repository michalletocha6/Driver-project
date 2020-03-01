package pl.coderslab.modelDto;

import lombok.Data;
import pl.coderslab.model.Answer;

import java.util.List;

@Data
public class QuestionDto {
    private Long id;

    private String description;

    private List<Answer> answers;
}
