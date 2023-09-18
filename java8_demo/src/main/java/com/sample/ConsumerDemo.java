package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import lombok.extern.java.Log;

@Log
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> printInteger = (input) -> log.info("input:" + input);
        printInteger.accept(2);
        Consumer<List<Integer>> modifyList = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        Consumer<List<Integer>> printList = (input) -> input.forEach(printInteger);
        printList.accept(numbers);
        modifyList.andThen(printList).accept(numbers);
    }
}
