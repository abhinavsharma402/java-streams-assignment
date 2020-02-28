package com.knoldus.controller;



public class PersonDetails  {
    /**
     * getDetails used to get person details in String form .
     * @param name get name .
     * @param age get age .
     * @param id get id .
     * @param company get company .
     * @param designation get designation .
     *
     * @return string of person name age id company designation .
     */
    public static String getDetails(String name, int age, int id, String company, String designation) {
        return name + " " + age + " " + id + " " + company + " " + designation;
    }




}
