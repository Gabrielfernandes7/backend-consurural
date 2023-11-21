package com.consurural.consurural.models;

import com.consurural.consurural.enumerations.ServicoEnum;
import com.consurural.consurural.enumerations.SubtipoConsultoriaEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Formulario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "business_sector")
    private String business_sector;

    @Column(name = "servicoSelecionado")
    @Enumerated(EnumType.STRING)
    private ServicoEnum servicoSelecionado;

    @Column(name = "subtipoSelecionado")
    @Enumerated(EnumType.STRING)
    private SubtipoConsultoriaEnum subtipoSelecionado;
    
}
