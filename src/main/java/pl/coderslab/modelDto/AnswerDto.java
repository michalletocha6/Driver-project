package pl.coderslab.modelDto;

import lombok.Data;

@Data
public class AnswerDto {
    private Long id;

    private String description;

    private boolean correct;
}
