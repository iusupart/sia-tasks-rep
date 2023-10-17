package ru.luxkod.qa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HotelManagement {
    private List<Room> rooms;
    private List<Booking> bookings;

    public HotelManagement() {
        this.rooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public boolean bookRoom(String roomNumber, Customer customer, LocalDate startDate, LocalDate endDate) {
        Optional<Room> room = rooms.stream()
                .filter(r -> r.getNumber().equals(roomNumber) && r.isAvailable())
                .findFirst();

        if (room.isPresent()) {
            bookings.add(new Booking(room.get(), customer, startDate, endDate));
            room.get().setAvailable(false);
            return true;
        }
        return false;
    }

    //TODO update + fix
    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getAvailableRooms() {
        return rooms.stream()
                .filter(Room::isAvailable)
                .collect(Collectors.toList());
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}

