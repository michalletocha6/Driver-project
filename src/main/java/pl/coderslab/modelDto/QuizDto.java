package pl.coderslab.modelDto;

import lombok.Data;

import java.util.List;

@Data
public class QuizDto {
    private Long id;

    private String description;

    private List<QuestionDto> questions;


}
