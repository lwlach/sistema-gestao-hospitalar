package br.com.codenation.hospital.repository;

import br.com.codenation.hospital.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
