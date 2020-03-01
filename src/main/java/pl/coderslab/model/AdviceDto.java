package pl.coderslab.model;

import lombok.Data;

@Data
public class AdviceDto {
    private Long id;

    private String title;

    private String content;

    private MediaDto media;
}
