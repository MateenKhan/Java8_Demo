package com.sample.collection.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;


@Log
public class PeekDemo {
    public static void main(String[] args) {
        List<Integer> input = List.of(1,2,3,455,2);
        long result = input.stream().peek(i -> log.info(String.valueOf(i))).count();
        log.info(String.valueOf(result));
        Stream<String> stream = Stream.of("Geeks", "For",
                                          "Geeks", "A",
                                          "Computer", "Portal");
  
        // Print the stream using peek()
        // by providing a terminal operation count()
        stream.peek(s -> System.out.println(s)).collect(Collectors.toList());
    }
}
