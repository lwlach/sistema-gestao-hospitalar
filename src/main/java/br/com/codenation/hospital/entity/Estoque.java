package br.com.codenation.hospital.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

//@Entity
public class Estoque {

    @Id
    @GeneratedValue
    private long id;

    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void addProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void removeProduto(Produto produto){
        this.produtos.remove(produto);
    }

    public List<Produto> getProdutos() {
        return Collections.unmodifiableList(produtos);
    }

}
