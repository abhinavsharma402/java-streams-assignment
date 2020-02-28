package com.knoldus.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class City {
    public static List getCities() {
        List<String> list = Arrays.asList("Delhi", "Agra", "Chandigarh", "Chennai", "chattisgarh");
        List cityStartWithC = list.stream().filter(city -> city.startsWith("C") || city.startsWith("c"))
                .sorted().collect(Collectors.toList());
        return cityStartWithC;
    }

}
