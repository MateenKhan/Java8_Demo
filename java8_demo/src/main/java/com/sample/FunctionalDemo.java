package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalDemo {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 4, 5);
        Function<Integer, Integer> doubleListInteger = (input) -> {return input * 2;};
        List<Integer> result = integers.stream().map(doubleListInteger).collect(Collectors.toList());
        System.out.println("input:" + integers);
        System.out.println("result:" + result);

    }

}
