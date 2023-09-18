package com.sample.collection.stream;

import java.util.List;

import lombok.extern.java.Log;

@Log
public class ReduceDemo {
    public static void main(String[] args) {

        List<Integer> inpList = List.of(1, 2, 3);
        Integer result = inpList.stream().reduce(0, (subtotal, element) -> subtotal + element);
        log.info(result.toString());

        List<String> letters = List.of("M","A","T","E","E","N");
        String result2 = letters.stream().reduce("", (subtotal, element) -> subtotal + element);
        log.info(result2);
    }
}
