package com.knoldus.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Multiply class multiplies corresponding elements of two lists .
 */
public class Multiply {
    /**
     * getMultiplicationOfTwoList used to multiply corresponding elements of two list
     * @param firstList take first list
     * @param secondList take second list
     * @return resultant list .
     */
    public static List<Integer> getMultiplicationOfTwoList(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = IntStream.range(0, firstList.size())
                .map(index -> firstList.get(index) * secondList.get(index))
                .boxed().collect(Collectors.toList());
        return result;
    }


}