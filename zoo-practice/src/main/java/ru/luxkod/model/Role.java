package ru.luxkod.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Role {
    KEEPER("Кормильщик"),
    VETERINARY("Ветеринар");
    private final String roleName;
}
