package br.com.codenation.hospital.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

//@Entity
public class Hospital {
    @Id
    @GeneratedValue
    private Long id;

    private Estoque estoque;

    @NotBlank
    private int leitos;

    public Hospital(Estoque estoque, @NotBlank int leitos) {
        this.estoque = estoque;
        this.leitos = leitos;
    }

    public void ocupaVaga(){
        if(temVaga()) {
            leitos--;
        }
    }

    public boolean temVaga(){
        return leitos > 0;
    }

    public Long getId() {
        return id;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public int getLeitos() {
        return leitos;
    }
}
