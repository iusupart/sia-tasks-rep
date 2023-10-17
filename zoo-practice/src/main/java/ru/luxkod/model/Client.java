package ru.luxkod.model;

//        3. Посетители:
//
//        Атрибуты: имя, год и день рождения, наличие соц карты, наличие студ билета и тип билета.
//        Методы: посещение зоопарка.

import lombok.Data;

import java.time.LocalDate;

@Data
public class Client {
    private String name;
    private LocalDate birthdayDate;
    private TicketType ticketType;
    private boolean isHasSocial;
    private boolean isHasStudent;

    public Client(String name,
                  LocalDate birthdayYear,
                  boolean isHasSocial, boolean isHasStudent) {
        this.name = name;
        this.birthdayDate = birthdayYear;
        this.isHasSocial = isHasSocial;
        this.isHasStudent = isHasStudent;

        //TODO Add ticket logic

        
    }

    public boolean isTodayBirthday() {
        LocalDate today = LocalDate.now();

        return today.getMonth() == birthdayDate.getMonth()
                && today.getDayOfMonth() == birthdayDate.getDayOfMonth();
    }
}
