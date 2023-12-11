package com.consurural.consurural.enumerations;

import lombok.Getter;

@Getter
public enum ConsultanceEnum {
    DAIRY_CATTLE("Bovinocultura Leiteira"),
    FRUIT_CROPS("Fruticultura"),
    LARGE_CROPS("Grandes Culturas"),
    POULTRY_FARMING("Avicultura");

    private final String description;

    ConsultanceEnum(String description) {
        this.description = description;
    }
}
