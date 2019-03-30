package br.com.codenation.hospital.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "estoque")
public class Estoque {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    private String nome;

    private String descricao;

    private Integer quantidade;

    @ManyToOne(optional = false)
    private Hospital hospital;

    public Estoque() {
    }

    public Estoque(String nome, String descricao, Integer quantidade, Hospital hospital) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.hospital = hospital;
    }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
