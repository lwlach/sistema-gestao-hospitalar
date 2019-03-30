package br.com.codenation.hospital.controller;

import br.com.codenation.hospital.EstoqueResourceAssembler;
import br.com.codenation.hospital.entity.Estoque;
import br.com.codenation.hospital.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstoqueController {

    @Autowired
    private final EstoqueRepository repository;
    @Autowired
    private final EstoqueResourceAssembler assembler;

    public EstoqueController(EstoqueRepository repository, EstoqueResourceAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @GetMapping("/produto")
    public List<Estoque> all(){
        return repository.findAll();
    }

    @GetMapping("/produto/{id}")
    public Resource<Estoque> one(@PathVariable Long id){
        Estoque estoque = repository.findById(id)
                .orElse(new Estoque());

        return assembler.toResource(estoque);
    }
}
