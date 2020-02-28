package com.knoldus.controller;

import com.knoldus.model.User;

import java.util.List;
import java.util.stream.Collectors;

/**
 * UserDetails used to perform operations on user .
 */

public class UserDetails {
    /**
     * getUserSpecifiedAgeAndAddress  get users With Specified Age And Address .
     * @param users taking users list .
     * @return users With Specified Age And Address .
     */

    public static List<User> getUserSpecifiedAgeAndAddress(List<User> users) {
        List<User> usersWithSpecifiedAgeAndAddress =
                users.stream().filter(user -> user.getAge() > 18 && user.getAddress() == "Delhi")
                        .collect(Collectors.toList());
        return usersWithSpecifiedAgeAndAddress;
    }

    /**
     * getUserSpecifiedIdAndAge users With Specified Id And Age .
     *@param users taking users list .
     *@return users With Specified Id And Age .
     */

    public static List<User> getUserSpecifiedIdAndAge(List<User> users) {
        List<User> usersWithSpecifiedIdAndAge = users.stream()
                .filter(user -> user.getId() > 10 && user.getAge() < 20).collect(Collectors.toList());
        return usersWithSpecifiedIdAndAge;
    }

    /**
     *getEvenAgeUser get users With Even Age .
     *@param users taking users list .
     *@return users With Even Age .
     */

    public static List<User> getEvenAgeUser(List<User> users) {
        List<User> usersWithEvenAge = users.stream().filter(user -> user.getAge() % 2 == 0)
                .collect(Collectors.toList());
        return usersWithEvenAge;
    }

    /**
     *getAgeAndAddresParticularUser users With Particular Age And Address .
     *@param users taking users list .
     *@return users With  Age18 And Address Delhi .
     */

    public static List<User> getAgeAndAddresParticularUser(List<User> users) {
        List<User> usersWithParticularAgeAndAddres =
                users.stream().filter(user -> user.getAge() == 18 && user.getAddress() == "Delhi")
                        .collect(Collectors.toList());
        return usersWithParticularAgeAndAddres;
    }
}

