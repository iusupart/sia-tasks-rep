package ru.luxkod.entities.states.health;

import ru.luxkod.entities.Animal;

public interface HealthState {
    void makeHealthy(Animal animal);
    void makeSick(Animal animal);
}
