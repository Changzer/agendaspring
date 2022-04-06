package com.example.agendaspring.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
@Entity
@Table(name = "pacientes", schema = "public")
@Getter @Setter
public class Paciente extends Pessoa{
    @Enumerated(EnumType.STRING)
    private TipoAtendimento tipoAtendimento;
    @OneToOne(fetch = FetchType.EAGER)
    private Convenio convenio;
    private String numeroCartaoConvenio;
    private LocalDateTime dataVencimento;


}
