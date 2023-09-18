package com.sample.collection.stream;

import java.util.List;
import java.util.stream.Collectors;

public class EvenFilter {
    public static void main(String[] args) {
        List<Integer> inpList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> output = inpList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(output);
    }
}
