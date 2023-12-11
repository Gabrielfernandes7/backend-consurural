package com.consurural.consurural.enumerations;

import lombok.Getter;

@Getter
public enum ActivitiesEnum {
    DIAGNOSTIC_SURVEY("Levantamento de diagnóstico"),
    CONSULTANCIES("Consultorias"),
    AGRICULTURAL_PROJECTS("Projetos Agropecuários"),
    IRRIGATION_EFFICIENCY_TESTS("Testes de Eficiência de Irrigação");

    private final String description;

    ActivitiesEnum(String description){
        this.description = description;
    }
}
