package br.com.codenation.hospital.controller;

import br.com.codenation.hospital.ProdutoResourceAssembler;
import br.com.codenation.hospital.entity.Produto;
import br.com.codenation.hospital.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController {

//    @Autowired
    private final ProdutoRepository repository;
//    @Autowired
    private final ProdutoResourceAssembler assembler;

    public ProdutoController(ProdutoRepository repository, ProdutoResourceAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @GetMapping("/produto")
    public List<Produto> all(){
        return repository.findAll();
    }

    @GetMapping("/produto/{id}")
    public Resource<Produto> one(@PathVariable Long id){
        Produto produto = repository.findById(id)
                .orElse(new Produto());

        return assembler.toResource(produto);
    }
}
