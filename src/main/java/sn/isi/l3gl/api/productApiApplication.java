package main.java.sn.isi.l3gl.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
    "sn.isi.l3gl.api",  // Scanne les contrôleurs de ce projet
    "sn.isi.l3gl.core"  // Scanne les services du module product-core (Nexus) 
})
@EntityScan("sn.isi.l3gl.core.entity") // Permet de trouver l'entité Product dans le core [cite: 7]
@EnableJpaRepositories("sn.isi.l3gl.core.repository") // Permet d'activer les repositories du core 
public class ProductApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApiApplication.class, args);
    }
}