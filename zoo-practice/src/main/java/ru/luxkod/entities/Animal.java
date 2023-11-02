package ru.luxkod.entities;

import ru.luxkod.entities.states.health.HealthState;
import ru.luxkod.entities.states.health.HealthyState;
import ru.luxkod.entities.states.hunger.HungerState;

public class Animal {
    private String name;
    private HealthState healthState;
    private HungerState hungerState;

    public Animal(String name) {
        this.name = name;
        this.healthState = new HealthyState();
    }

    public void setHealthState(HealthState healthState) {
        this.healthState = healthState;
    }

    public void makeHealthy() {
        healthState.makeHealthy(this);
    }

    public void makeSick() {
        healthState.makeSick(this);
    }

    public void setHungerState(HungerState hungerState) {
        this.hungerState = hungerState;
    }

    public void makeFool() {
        hungerState.makeFool(this);
    }

    public void makeHungry() {
        hungerState.makeHungry(this);
    }

    public String getName() {
        return name;
    }
}
