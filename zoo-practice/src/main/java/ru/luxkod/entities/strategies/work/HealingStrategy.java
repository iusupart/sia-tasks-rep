package ru.luxkod.entities.strategies.work;

import ru.luxkod.entities.Animal;

public class HealingStrategy implements WorkStrategy {
    @Override
    public void doWork(Animal animal) {
        System.out.println("Полечил животное " + animal);
    }
}
