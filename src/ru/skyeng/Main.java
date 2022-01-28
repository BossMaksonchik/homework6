package ru.skyeng;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String firstName = " Ivan";
        String middleName = " Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотруднка - " + fullName);

        String fullName1 = "Ivanov Ivan Ivanovich";
        String upperFullName = fullName1.toUpperCase();
        System.out.println(upperFullName);



        String fullName2 = "Ivanov Ivan Ivanovich";
        String result = fullName2.replace(" ","; ");
        System.out.println(result);

        String fullName3 = "Иванов Семён Семёнович";
        String validFullName = fullName3.replace('ё','е');
        System.out.println("Данные ФИО сотрудника - " + validFullName);
    }
}
