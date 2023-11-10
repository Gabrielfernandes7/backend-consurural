package com.consurural.consurural.enumerations;

import lombok.Getter;

@Getter
public enum SubtipoConsultoriaEnum {
    BOVINOCULTURA_LEITEIRA("Bovinocultura Leiteira"),
    FRUTICULTURA("Fruticultura"),
    GRANDES_CULTURAS("Grandes Culturas"),
    AVICULTURA("Avicultura");

    private final String descricao;

    SubtipoConsultoriaEnum(String descricao) { this.descricao = descricao; }
}
