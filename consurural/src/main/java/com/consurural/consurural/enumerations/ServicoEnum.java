package com.consurural.consurural.enumerations;

import lombok.Getter;

@Getter
public enum ServicoEnum {
    LEVANTAMENTO_DE_DIAGNOSTICO("Levantamento de diagnóstico"),
    CONSULTORIAS("Consultorias"),
    PROJETOS_AGROPECUARIOS("Projetos Agropecuários"),
    TESTES_DE_EFICIENCIA_DE_IRRIGACAO("Testes de Eficiência de Irrigação");

    private final String descricao;

    ServicoEnum(String descricao){
        this.descricao = descricao;
    }

}
