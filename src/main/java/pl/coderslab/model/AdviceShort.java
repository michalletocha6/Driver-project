package pl.coderslab.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "advices")
@Data
public class AdviceShort extends AbstractAdvice {}
