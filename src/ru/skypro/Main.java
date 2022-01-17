package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //Ex.№1
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        //Ex.№2
        String nameCaps = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + nameCaps);

        //Ex.№3
        String newName = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела —  " + newName);

        //Ex.№4
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);


    }



}
