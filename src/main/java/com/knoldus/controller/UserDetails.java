package com.knoldus.controller;

import com.knoldus.model.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserDetails {
    public static List<User> getUserSpecifiedAgeAndAddress(List<User> users) {
        List<User> usersWithSpecifiedAgeAndAddress =
                users.stream().filter(user -> user.getAge() > 18 && user.getAddress() == "Delhi")
                        .collect(Collectors.toList());
        return usersWithSpecifiedAgeAndAddress;
    }

    public static List<User> getUserSpecifiedIdAndAge(List<User> users) {
        List<User> usersWithSpecifiedIdAndAge = users.stream()
                .filter(user -> user.getId() > 10 && user.getAge() < 20).collect(Collectors.toList());
        return usersWithSpecifiedIdAndAge;
    }

    public static List<User> getEvenAgeUser(List<User> users) {
        List<User> usersWithEvenAge = users.stream().filter(user -> user.getAge() % 2 == 0)
                .collect(Collectors.toList());
        return usersWithEvenAge;
    }

    public static List<User> getAgeAndAddresParticularUser(List<User> users) {
        List<User> usersWithParticularAgeAndAddres =
                users.stream().filter(user -> user.getAge() == 18 && user.getAddress() == "Delhi")
                        .collect(Collectors.toList());
        return usersWithParticularAgeAndAddres;
    }
}

