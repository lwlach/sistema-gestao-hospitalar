package br.com.codenation.hospital.repository;

import br.com.codenation.hospital.entity.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {}
