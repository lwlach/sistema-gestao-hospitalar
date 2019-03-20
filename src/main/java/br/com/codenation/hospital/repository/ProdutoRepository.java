package br.com.codenation.hospital.repository;

import br.com.codenation.hospital.entity.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository <Produto, Long> {}
