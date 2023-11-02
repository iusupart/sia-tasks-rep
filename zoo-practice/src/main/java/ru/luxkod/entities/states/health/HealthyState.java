package ru.luxkod.entities.states.health;

import ru.luxkod.entities.Animal;

public class HealthyState implements HealthState {
    @Override
    public void makeHealthy(Animal animal) {
        System.out.println("Животное " + animal.getName() + " здорово, лечить его не нужно!");
    }

    @Override
    public void makeSick(Animal animal) {
        System.out.println("Животное " + animal.getName() + " заболело");
        animal.setHealthState(new UnhealthyState());
    }
}
