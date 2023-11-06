package com.consurural.consurural.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
//Terminar dps
public class Depoiments {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(nullable = false)
    private String autor;
    @Column(nullable = false)
    private String depoimento;

    public Depoiments(String depoimento, String autor) {
        this.autor = autor;
        this.depoimento = depoimento;
    }
}
