package com.consurural.consurural.configuration;

import com.consurural.consurural.models.Consultances;
import com.consurural.consurural.repository.ConsultancesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class ConfigDB {

    @Autowired
    private ConsultancesRepository repo;

    @Bean
    CommandLineRunner runner() {
        return args -> {

            Consultances consu = new Consultances();
            consu.setName("Alguma pessoa");
            consu.setPhone("5585999999999");

            if(repo.findAll().isEmpty()) {
                repo.save(consu);
            }

        };
    }

}
