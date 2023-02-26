package com.api.projetoifba.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "professores")
public class Professor {

    @Column(nullable = false,length = 70)
    private String nome;

    @Column(nullable = false,length = 50)
    private String email;

    @Column(nullable = false,unique = true)
    private String codigo;

    @Column(nullable = false,unique = true,length = 70)
    private String cpf;

    public Professor(){}

    public Professor(String nome, String email, String codigo, String cpf) {
        this.nome = nome;
        this.email = email;
        this.codigo = codigo;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Professor [nome=" + nome + ", email=" + email + ", codigo=" + codigo + ", cpf=" + cpf + "]";
    }
}
