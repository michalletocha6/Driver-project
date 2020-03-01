package pl.coderslab.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "advices")
@Data
public class Advice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    @DateTimeFormat(pattern = "YYYY-MM-DD")
    private LocalDate created;

    @OneToOne
    @JoinColumn(name = "media_id")
    private Media media;

    @OneToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    @PrePersist
    public void prePersist() {
        created = LocalDate.now();
    }
}
