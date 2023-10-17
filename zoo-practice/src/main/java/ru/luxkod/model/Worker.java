package ru.luxkod.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Worker {
    private String name;
    private Role role;

    //TODO
    public void feedAnimal() {
        if (role != Role.KEEPER) {
            System.out.println("потрачено. Вас покусали и вы ушли с позором домой:с");
            return;
        }
        System.out.println("супер, покормили зверюшку!");
    }

    public void healAnimal() {
        if (role != Role.VETERINARY) {
            System.out.println("Вы не айболит, отойдите от зверюшки!");
            return;
        }
        System.out.println("супер, полечили зверюшку! Она жива и здорова!");
    }
}
