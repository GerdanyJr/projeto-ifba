package com.api.projetoifba.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "requerimento")
public class Requerimento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @OneToOne
    private Espaço espaço;
    @Column(name = "data_de_requisicao")
    private LocalDateTime dataDeRequisicao;
    @Column(name = "horario_de_inicio")
    private LocalDateTime horarioDeInicio;
    @Column(name = "horario_de_termino")
    private LocalDateTime horarioDeTermino;
    @ManyToOne
    private Aluno aluno;

    public Requerimento(){}

    public Requerimento(Espaço espaço, LocalDateTime horarioDeInicio,
            LocalDateTime horarioDeTermino, Aluno aluno) {
        this.espaço = espaço;
        this.dataDeRequisicao = LocalDateTime.now();
        this.horarioDeInicio = horarioDeInicio;
        this.horarioDeTermino = horarioDeTermino;
        this.aluno = aluno;
    }

    public UUID getId() {
        return id;
    }

    public Espaço getEspaço() {
        return espaço;
    }

    public void setEspaço(Espaço espaço) {
        this.espaço = espaço;
    }

    public LocalDateTime getDataDeRequisicao() {
        return dataDeRequisicao;
    }

    public void setDataDeRequisicao(LocalDateTime dataDeRequisicao) {
        this.dataDeRequisicao = dataDeRequisicao;
    }

    public LocalDateTime getHorarioDeInicio() {
        return horarioDeInicio;
    }

    public void setHorarioDeInicio(LocalDateTime horarioDeInicio) {
        this.horarioDeInicio = horarioDeInicio;
    }

    public LocalDateTime getHorarioDeTermino() {
        return horarioDeTermino;
    }

    public void setHorarioDeTermino(LocalDateTime horarioDeTermino) {
        this.horarioDeTermino = horarioDeTermino;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Requerimento [id=" + id + ", espaço=" + espaço + ", dataDeRequisicao=" + dataDeRequisicao
                + ", horarioDeInicio=" + horarioDeInicio + ", horarioDeTermino=" + horarioDeTermino + ", aluno=" + aluno
                + "]";
    }    
}
