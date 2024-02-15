package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<User> usersAbove45 = filterAboveAge(UsersRepository.getUsersList(), 45);
        for (User user : usersAbove45) {
            System.out.println("User age: " + user.getAge());
        }
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static List<User> filterAboveAge(List<User> users, int ageThreshold) {
        return users.stream()
                .filter(user -> user.getAge() > ageThreshold)
                .collect(Collectors.toList());

    }
}