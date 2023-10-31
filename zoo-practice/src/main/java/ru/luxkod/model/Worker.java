package ru.luxkod.model;

import lombok.Data;
import ru.luxkod.model.strategy.work.FeedingStrategy;
import ru.luxkod.model.strategy.work.HealingStrategy;
import ru.luxkod.model.strategy.work.WorkStrategy;

@Data
public class Worker {
    private String name;
    private Role role;
    private WorkStrategy workStrategy;

    public Worker(String name, Role role) {
        this.name = name;
        this.role = role;
        setWorkingStrategy(role);
    }

    private void setWorkingStrategy(Role role) {
        switch (role) {
            case KEEPER:
                this.workStrategy = new FeedingStrategy();
                break;
            case VETERINARY:
                this.workStrategy = new HealingStrategy();
                break;
            default:
                System.err.println("Wrong!");
        }
    }

    public void doWork(Animal animal) {
        workStrategy.doWork(animal);
    }
}
