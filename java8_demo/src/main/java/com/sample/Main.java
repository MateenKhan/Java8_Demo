package com.sample;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// CODE EXAMPLE VALID FOR COMPILING
class Main {
    public static void main(String[] args) {
        // JAVA 8
        // get the first non repeatable character using java 8 only
        String str = "character";
        // Optional<Character> res = 
        Stream.of(str.toCharArray())
                .collect(
                    Collectors
                        .groupingBy(Function.identity(),
                            Collectors.filtering(
                                    ( i ) -> {
                                        System.out.println("i--"+i);
                                        return true;}
                                    ,Collectors.counting()
                                )
                                )
                    );
                    

        // if (result != null && result.get() != null && result.get().length != 0) {
        //     for (char a : result.get()) {
        //         System.out.print(a);
        //     }
        // } else {
        //     System.out.println("dead logic");
        // }

    }
}
