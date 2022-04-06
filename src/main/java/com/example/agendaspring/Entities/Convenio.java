package com.example.agendaspring.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import java.math.BigDecimal;
@Entity
@Table(name = "convenios", schema = "public")
@Getter @Setter
public class Convenio extends AbstractEntity {
    @Column(name = "nome_convenio", nullable = false)
    private String nome;
    @Digits(fraction = 2, integer = 3)
    @Column(name = "valor_convenio", nullable = false)
    private BigDecimal valor;

}
