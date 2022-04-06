package com.example.agendaspring.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
@MappedSuperclass
@Getter @Setter
public class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    private Long id;
    @Column(nullable = false, name = "cadastro")
    private LocalDateTime cadastro;
    @Column(name = "atualizado")
    private LocalDateTime atualizado;
    @Column(name = "excluido")
    private LocalDateTime excluido;

}
