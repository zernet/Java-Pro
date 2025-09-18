package com.gmail.zernetcsgo.hw18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();

        repo.addUser(new User(1, "Alice", "alice@example.com"));
        repo.addUser(new User(2, "Bob", "bob@example.com"));
        repo.addUser(new User(3, "Charlie", "charlie@example.com"));

        int searchId = 2;
        Optional<User> userById = repo.findUserById(searchId);
        userById.ifPresentOrElse(
                user -> System.out.println("Знайдено користувача за id=" + searchId + ": " + user),
                () -> System.out.println("Користувача з id=" + searchId + " не знайдено")
        );

        String searchEmail = "alice@example.com";
        Optional<User> userByEmail = repo.findUserByEmail(searchEmail);
        userByEmail.ifPresentOrElse(
                user -> System.out.println("Знайдено користувача за email=" + searchEmail + ": " + user),
                () -> System.out.println("Користувача з email=" + searchEmail + " не знайдено")
        );

        Optional<List<User>> allUsers = repo.findAllUsers();
        allUsers.ifPresentOrElse(
                list -> System.out.println("Кількість користувачів у списку: " + list.size()),
                () -> System.out.println("Список користувачів порожній")
        );
    }
}

