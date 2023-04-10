package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.passport = "1234 № 123456";
        post.phone = "+7(999)456-45-45";
        post.subscription = true;
        post.birthday.day = 12;
        post.birthday.month = 4;
        post.birthday.year = 1985;

    }
}