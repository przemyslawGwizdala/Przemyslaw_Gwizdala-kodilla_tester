package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        double avgPostsAbove40 = calculateAveragePosts(UsersRepository.getUsersList(), 40);
        double avgPostsBelow40 = calculateAveragePostsBelow(UsersRepository.getUsersList(), 40);

        System.out.println("Average posts for users aged 40 and above: " + avgPostsAbove40);
        System.out.println("Average posts for users below the age of 40: " + avgPostsBelow40);
    }
    public static double calculateAveragePosts(List<User> users, int ageThreshold) {
        return users.stream()
                .filter(user -> user.getAge() >= ageThreshold)
                .mapToDouble(User::getNumberOfPosts)
                .average()
                .orElse(0.0);
    }
    public static double calculateAveragePostsBelow(List<User> users, int ageThreshold) {
        return users.stream()
                .filter(user -> user.getAge() < ageThreshold)
                .mapToDouble(User::getNumberOfPosts)
                .average()
                .orElse(0.0);
    }
}
