package br.com.codenation.hospital;


import br.com.codenation.hospital.entity.Estoque;
import br.com.codenation.hospital.repository.EstoqueRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocalDatabase {

    @Bean
    CommandLineRunner initDatabase(EstoqueRepository repository) {
        return args -> {
            System.out.println("iniciando");
        };
    }
}
