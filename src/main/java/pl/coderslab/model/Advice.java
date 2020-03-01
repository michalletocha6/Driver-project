package pl.coderslab.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "advices")
@Data
public class Advice {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String content;

    @OneToOne
    @JoinColumn(name = "media_id")
    private Media media;
}
