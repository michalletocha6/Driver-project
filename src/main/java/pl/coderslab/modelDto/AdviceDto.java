package pl.coderslab.modelDto;

import lombok.Data;
import pl.coderslab.modelDto.MediaDto;

import java.time.LocalDate;

@Data
public class AdviceDto {
    private Long id;

    private String title;

    private String content;

    private LocalDate created;

    private MediaDto media;

    private QuizDto quiz;
}
