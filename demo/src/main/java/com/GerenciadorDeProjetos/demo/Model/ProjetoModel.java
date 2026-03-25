package com.GerenciadorDeProjetos.demo.Model;
//Comit Model
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_projeto")
public class ProjetoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "nome_projeto")
    private String nome;
    private LocalDate data_inicio;
    @Column (name = "data_fim")
    private LocalDate data_fim;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return data_inicio;
    }

    public void setData_inicio (LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }

    public LocalDate getData_fim() {
        return data_fim;
    }

    public void setData_fim(LocalDate data_fim) {
        this.data_fim = data_fim;
    }
}