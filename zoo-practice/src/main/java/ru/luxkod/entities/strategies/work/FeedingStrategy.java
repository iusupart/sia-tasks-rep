package ru.luxkod.entities.strategies.work;

import ru.luxkod.entities.Animal;

public class FeedingStrategy implements WorkStrategy {
    @Override
    public void doWork(Animal animal) {
        System.out.println("Покормил животное " + animal);
    }
}
