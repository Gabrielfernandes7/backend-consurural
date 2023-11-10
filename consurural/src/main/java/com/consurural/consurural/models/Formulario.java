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

    private String nome;
    private String endereco;
    private String telefone;
    private String ramoAtividade;

    @Enumerated(EnumType.STRING)
    private ServicoEnum servicoSelecionado;
    
    @Enumerated(EnumType.STRING)
    private SubtipoConsultoriaEnum subtipoSelecionado;
}
