package com.sample.collection.stream;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import lombok.extern.java.Log;

@Log
public class MininumNumber {

    public static void main(String[] args) {
        new MininumNumber().process();
    }

    public void process() {
        List<Integer> integers = List.of(21, 22, 21, 23, 4, 41, 222);
        Optional<Integer> min = integers.stream().reduce((x, y) -> x.compareTo(y) < 0 ? x : y);
        log.info(min.get().toString());
        Optional<Integer> min2 = integers.stream().distinct().reduce(Integer::min);
        log.info(min2.get().toString());
        int min3 = integers.stream().distinct().reduce(0,(x, y) -> x.compareTo(y) < 0 ? x : y);
        log.info(String.valueOf(min3));
    }
}
