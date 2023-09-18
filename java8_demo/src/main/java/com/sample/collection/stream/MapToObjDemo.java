package com.sample.collection.stream;

import java.util.stream.IntStream;

public class MapToObjDemo {
    public static void main(String[] args) {
        String[] myArray = new String[] { "stream", "is", "a",
                "sequence", "of", "elements",
                "like", "list" };

        // create instream on range of integers
        // filter by even integer and map
        // the integer to the Object of myArray
        IntStream.rangeClosed(0, myArray.length - 1)
                .filter(x -> x % 2 == 0)
                .mapToObj(x -> {
                    return myArray[x];
                })
                .forEach(System.out::println);
    }
}
