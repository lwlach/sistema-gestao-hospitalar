package br.com.codenation.hospital;

import br.com.codenation.hospital.controller.ProdutoController;
import br.com.codenation.hospital.entity.Produto;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

@Component
public class ProdutoResourceAssembler implements ResourceAssembler<Produto, Resource<Produto>> {
    @Override
    public Resource<Produto> toResource(Produto produto) {
        return new Resource<>(produto, linkTo(methodOn(ProdutoController.class).one(produto.getId())).withSelfRel(),
                linkTo(methodOn(ProdutoController.class).all()).withRel("produto"));
    }
}
