package com.api.projetoifba.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "alunos")
public class Aluno{

    @Column(nullable = false,length = 70)
    private String nome;

    @Id
    @Column(nullable = false,length = 12)
    private String matricula;

    @Column(nullable = false,length = 11)
    private String cpf;

    @Column(nullable = false,length = 50)
    private String email;

    @Column(nullable = false,length = 30)
    private String curso;

    @Column(nullable = false,length = 1)
    private Character sexo; 

    @OneToMany
    private List<Endereço> enderecos = new ArrayList<>();

    public Aluno(){}

    public Aluno(String nome, String matricula, String cpf, String email, String curso, Character sexo,
            Endereço endereço) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.email = email;
        this.curso = curso;
        this.sexo = sexo;
        enderecos.add(endereço);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public List<Endereço> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereço> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", cpf=" + cpf + ", email=" + email + ", curso="
                + curso + ", sexo=" + sexo + ", enderecos=" + enderecos + "]";
    }
}