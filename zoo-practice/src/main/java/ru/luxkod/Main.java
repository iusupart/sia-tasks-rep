package ru.luxkod;

import ru.luxkod.entities.Animal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Animal animal1 = new Animal("Zozo");
        animal1.makeHealthy();
    }
}