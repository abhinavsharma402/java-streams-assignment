package com.knoldus.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Multiply {
    public static List<Integer> getMultiplicationOfTwoList(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = IntStream.range(0, firstList.size())
                .map(index -> firstList.get(index) * secondList.get(index))
                .boxed().collect(Collectors.toList());
        return result;
    }


}