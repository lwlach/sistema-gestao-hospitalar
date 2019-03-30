package br.com.codenation.hospital;

import br.com.codenation.hospital.controller.EstoqueController;
import br.com.codenation.hospital.entity.Estoque;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

@Component
public class EstoqueResourceAssembler implements ResourceAssembler<Estoque, Resource<Estoque>> {
    @Override
    public Resource<Estoque> toResource(Estoque estoque) {
        return new Resource<>(estoque, linkTo(methodOn(EstoqueController.class).one(estoque.getId())).withSelfRel(),
                linkTo(methodOn(EstoqueController.class).all()).withRel("estoque"));
    }
}
