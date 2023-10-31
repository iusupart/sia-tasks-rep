package ru.luxkod.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Zoo {
    private static Zoo instance;

    private List<Animal> animalList;
    private List<Worker> workerList;
    private List<Client> clientList;

    private Zoo() {
        animalList = new ArrayList<>();
        workerList = new ArrayList<>();
        clientList = new ArrayList<>();
    }

    public static Zoo getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Zoo();
        }
        return instance;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public List<Worker> getWorkerList() {
        return workerList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    //TODO Other methods (create adding animals, workers and clients logic)
}
