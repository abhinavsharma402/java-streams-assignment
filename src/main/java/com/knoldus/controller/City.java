package com.knoldus.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * City class used to get operations on  cities .
 */
public class City {
    /**
     * getCities method used to get sorted cities start with C .
     * @param list .
     * @return sorted cities start with "C" .
     */
    public static List getCities(List<String> list) {

        List cityStartWithC = list.stream().filter(city -> city.startsWith("C") || city.startsWith("c"))
                .sorted().collect(Collectors.toList());
        return cityStartWithC;
    }

}
