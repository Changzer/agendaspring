package com.example.agendaspring.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "especialidade", schema = "public")
@Getter @Setter
public class Especialidade {
    @Id
    @Column(name = "id_especialidade", nullable = false)
    private Long idEspecialidade;
    private String especialidade;
}
