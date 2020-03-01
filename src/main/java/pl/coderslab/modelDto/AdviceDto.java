package pl.coderslab.modelDto;

import lombok.Data;
import pl.coderslab.modelDto.MediaDto;

@Data
public class AdviceDto {
    private Long id;

    private String title;

    private String content;

    private MediaDto media;

    private QuizDto quiz;
}
