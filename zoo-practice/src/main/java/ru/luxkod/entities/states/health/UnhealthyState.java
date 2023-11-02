package ru.luxkod.entities.states.health;

import ru.luxkod.entities.Animal;

public class UnhealthyState implements HealthState {
    @Override
    public void makeHealthy(Animal animal) {
        System.out.println("Животное " + animal.getName() + " вылечено");
        animal.setHealthState(new HealthyState());
    }

    @Override
    public void makeSick(Animal animal) {
        System.out.println("Животное " + animal.getName() + " уже болеет, не нужно над ним издеваться!");
    }
}
