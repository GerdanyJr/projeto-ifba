package com.api.projetoifba.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "alunos")
public class Aluno{
    @Column(nullable = false,length = 50)
    private String nome;
    @Column(nullable = false,length = 12)
    private String matricula;
    @Column(nullable = false,length = 11)
    private String cpf;
    @Column(nullable = false,length = 30)
    private String email;
    private Endereço endereco;
}