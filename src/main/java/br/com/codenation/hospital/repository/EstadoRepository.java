package br.com.codenation.hospital.repository;

import br.com.codenation.hospital.entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
