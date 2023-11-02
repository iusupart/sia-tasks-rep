package ru.luxkod.entities.states.hunger;

import ru.luxkod.entities.Animal;

public class FoolState implements HungerState {
    @Override
    public void makeHungry(Animal animal) {
        System.out.println("Животное " + animal + "стало голодать");
        animal.setHungerState(new HungryState());
    }

    @Override
    public void makeFool(Animal animal) {
        System.out.println("Животное " + animal + "уже покушав");
    }

}

