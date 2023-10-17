package ru.luxkod.qa;

public class Room {
    private String number;
    private String type;
    private boolean isAvailable;
    private double price;

    public Room(String number, String type, boolean isAvailable, double price) {
        this.number = number;
        this.type = type;
        this.isAvailable = isAvailable;
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double getPrice() {
        return price;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
