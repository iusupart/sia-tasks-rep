package ru.luxkod.model.strategy.work;

import ru.luxkod.model.Animal;

public class HealingStrategy implements WorkStrategy {
    @Override
    public void doWork(Animal animal) {
        System.out.println("Полечил животное " + animal);
    }
}
