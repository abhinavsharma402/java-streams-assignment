package com.knoldus.model;

@FunctionalInterface
public interface Person {
    String getPersonDetails(String name, int age, int id, String company, String designation);
}
