package com.sample.collection.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class FlatMapDemo {
    
    public static void main(String[] args) {
        new FlatMapDemo().process();
    }

    public void process() {
        List<Integer> integers = List.of(14,21);
        List<Integer> integers2 = List.of(3,4);
        List<Integer> integers3 = List.of(12,33);
        List<Integer> integers4 = List.of(21,2);
        List<List<Integer>> integers5 = List.of(integers,integers2,integers3,integers4);

        Optional<Integer> min = integers5.stream().flatMap(list -> list.stream()).reduce((x, y) -> x.compareTo(y) < 0 ? x : y);
        log.info(min.get().toString());
        List<Integer> result = integers5.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        log.info(result.toString());
        
    }
}
