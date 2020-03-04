package pl.coderslab.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.time.LocalDate;

@Data
@MappedSuperclass
public class AbstractAdvice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private LocalDate created;

    @PrePersist
    public void prePersist() {
        created = LocalDate.now();
    }
}
