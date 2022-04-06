package com.example.agendaspring.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import java.util.ArrayList;
@MappedSuperclass
@Getter @Setter
public class Pessoa extends AbstractEntity{

    private String nome;
    private String telefone;
    private String celular;
    private String nacionalidade;
    private String cpf;
    private String rg;
    private String email;
    private String login;
    private String senha;
    private Sexo sexos;


}
