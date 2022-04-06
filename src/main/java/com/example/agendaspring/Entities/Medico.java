package com.example.agendaspring.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.ArrayList;
@Entity
@Table(name = "medico", schema = "public")
@Getter @Setter
public class Medico extends Pessoa {
    private String CRM;
    private BigDecimal porcentParticip;
    private String consultorio;
    @OneToOne
    @JoinColumn(name = "especialidade_id")
    private Especialidade especialidade;

}
