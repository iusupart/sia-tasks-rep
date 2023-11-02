package ru.luxkod.entities.states.hunger;

import ru.luxkod.entities.Animal;

public interface HungerState {
    void makeHungry(Animal animal);
    void makeFool(Animal animal);

}
