package com.knoldus.view;

import com.knoldus.controller.PersonDetails;
import com.knoldus.controller.UserDetails;
import com.knoldus.model.Person;
import com.knoldus.model.User;

import java.util.Arrays;
import java.util.List;

import static com.knoldus.controller.City.getCities;
import static com.knoldus.controller.Multiply.getMultiplicationOfTwoList;

public class Driver {
    public static void main(String[] args) {

        System.out.println("-------------Question 1--------------");
        Person person = PersonDetails::getDetails;
        String details = person.getPersonDetails("Abhinav", 22, 1351, "knoldus", "intern");
        System.out.println(details);

        System.out.println("-------------Question 2--------------");
        System.out.println(getCities());

        System.out.println("-------------Question 3--------------");
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);

        System.out.println(getMultiplicationOfTwoList(list, list1));

        System.out.println("-------------Question 4--------------");
        User emp1 = new User("Abhinav", 20, 1, "Delhi");
        User emp2 = new User("Abhinaav", 20, 11, "Agra");
        User emp3 = new User("Akash", 19, 12, "Agra");
        User emp4 = new User("Akash", 18, 12, "Delhi");
        List<User> users = Arrays.asList(emp1, emp2, emp3, emp4);
        List<User> usersWithSpecifiedAgeAndAddress = UserDetails.getUserSpecifiedAgeAndAddress(users);
        usersWithSpecifiedAgeAndAddress.stream().forEach(user -> System.out.println("1. " + user.getName() + " "
                + user.getAddress() + " " + user.getAge() + " "
                + user.getId()));

        List<User> usersWithSpecifiedIdAndAge = UserDetails.getUserSpecifiedIdAndAge(users);
        usersWithSpecifiedIdAndAge.stream().forEach(user -> System.out.println("2. " + user.getName() + " "
                + user.getAddress() + " " + user.getAge() + " "
                + user.getId()));

        List<User> usersWithEvenAge = UserDetails.getEvenAgeUser(users);
        usersWithEvenAge.stream().forEach(user -> System.out.println("3. " + user.getName() + " " + user.getAddress()
                + " " + user.getAge() + " " + user.getId()));

        List<User> usersWithParticularIdAndAge = UserDetails.getAgeAndAddresParticularUser(users);
        usersWithParticularIdAndAge.stream().forEach(user -> System.out.println("4. " + user.getName() + " "
                + user.getAddress() + " " + user.getAge() + " " + user.getId()));
    }

}

