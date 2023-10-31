package ru.luxkod.model.strategy.work;

import ru.luxkod.model.Animal;

public class FeedingStrategy implements WorkStrategy {
    @Override
    public void doWork(Animal animal) {
        System.out.println("Покормил животное " + animal);
    }
}
