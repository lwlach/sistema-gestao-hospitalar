package br.com.codenation.hospital.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "hospital")
public class Hospital {
    @Id
    @GeneratedValue
    private Long id;

    private int leitos;

    private int leitosDisponiveis;

    private String cep;

    private Cidade cidade;

    private String rua;

    private int numero;

    private String complemento;

    @OneToMany(mappedBy = "hospital")
    private List<Estoque> estoqueList;

    public Hospital() {
    }

    public Hospital(int leitos, int leitosDisponiveis, String cep, Cidade cidade, String rua, int numero, String complemento) {
        this.leitos = leitos;
        this.leitosDisponiveis = leitosDisponiveis;
        this.cep = cep;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLeitos() {
        return leitos;
    }

    public void setLeitos(int leitos) {
        this.leitos = leitos;
    }

    public int getLeitosDisponiveis() {
        return leitosDisponiveis;
    }

    public void setLeitosDisponiveis(int leitosDisponiveis) {
        this.leitosDisponiveis = leitosDisponiveis;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public List<Estoque> getEstoqueList() {
        return estoqueList;
    }

    public void setEstoqueList(List<Estoque> estoqueList) {
        this.estoqueList = estoqueList;
    }
}
