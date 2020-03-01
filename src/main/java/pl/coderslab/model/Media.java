package pl.coderslab.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medias")
@Data
public class Media {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
