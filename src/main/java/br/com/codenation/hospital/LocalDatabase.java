package br.com.codenation.hospital;


import br.com.codenation.hospital.entity.Produto;
import br.com.codenation.hospital.repository.ProdutoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocalDatabase {

    @Bean
    CommandLineRunner initDatabase(ProdutoRepository repository) {
        return args -> {
            System.out.println("Preloading " + repository.save(new Produto("mouse", "sem fio", 2)));
            System.out.println("Preloading " + repository.save(new Produto("teclado", "sem fio", 1)));
            System.out.println("Preloading " + repository.save(new Produto("teclado", "com fio", 1)));
            System.out.println("Preloading " + repository.save(new Produto("monitor", "widescreen", 1)));
        };
    }
}
