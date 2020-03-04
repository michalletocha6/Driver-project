package pl.coderslab.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "advices")
@Data
public class Advice extends AbstractAdvice {

    @OneToOne
    @JoinColumn(name = "media_id")
    private Media media;

    @OneToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

}
