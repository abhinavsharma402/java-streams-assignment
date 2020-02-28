package com.knoldus.model;

public class User {
    String name;
    int age;
    int id;
    String address;

    public User(String name, int age, int id, String address) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

}
