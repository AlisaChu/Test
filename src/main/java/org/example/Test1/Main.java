package org.example.Test1;

public class Main {
    public static void main(String[] args) {
        new User("Евгений", 35, Sex.MALE);
        new User("Марина", 34, Sex.FEMALE);
        new User("Алина", 7, Sex.FEMALE);


        System.out.println("Все пользователи:");
        AllUsers.getAllUsers().forEach(System.out::println);
        System.out.println("Все пользователи: MALE");
        AllUsers.getAllUsers(Sex.MALE).forEach(System.out::println);
        System.out.println("Все пользователи: FEMALE");
        AllUsers.getAllUsers(Sex.FEMALE).forEach(System.out::println);
        System.out.println("================================================");
        System.out.println("       всех пользователей: " + AllUsers.getHowManyUsers());
        System.out.println("  всех пользователей MALE: " + AllUsers.getHowManyUsers(Sex.MALE));
        System.out.println("всех пользователей FEMALE: " + AllUsers.getHowManyUsers(Sex.FEMALE));
        System.out.println("================================================");
        System.out.println("       общий возраст всех пользователей: " + AllUsers.getAllAgeUsers());
        System.out.println("  общий возраст всех пользователей MALE: " + AllUsers.getAllAgeUsers(Sex.MALE));
        System.out.println("общий возраст всех пользователей FEMALE: " + AllUsers.getAllAgeUsers(Sex.FEMALE));
        System.out.println("================================================");
        System.out.println("       средний возраст всех пользователей: " + AllUsers.getAverageAgeOfAllUsers());
        System.out.println("  средний возраст всех пользователей MALE: " + AllUsers.getAverageAgeOfAllUsers(Sex.MALE));
        System.out.println("средний возраст всех пользователей FEMALE: " + AllUsers.getAverageAgeOfAllUsers(Sex.FEMALE));
        System.out.println("================================================");
    }
}
