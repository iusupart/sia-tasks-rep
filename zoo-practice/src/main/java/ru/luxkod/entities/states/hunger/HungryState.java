package ru.luxkod.entities.states.hunger;

import ru.luxkod.entities.Animal;

public class HungryState implements HungerState {
    @Override
    public void makeFool(Animal animal) {
        System.out.println("Животное " + animal + "покушав");
        animal.setHungerState(new FoolState());

    }

    @Override
    public void makeHungry(Animal animal) {
        System.out.println("Животное " + animal + "уже голодает");
    }
}
