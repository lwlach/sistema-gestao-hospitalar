package br.com.codenation.hospital.repository;

import br.com.codenation.hospital.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {}
