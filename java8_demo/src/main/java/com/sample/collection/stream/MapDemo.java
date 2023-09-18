package com.sample.collection.stream;

import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class MapDemo {

    public static void main(String[] args) {
        List<Integer> inpList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String> output = inpList.stream().map(x -> (x * 2)+"--" ).collect(Collectors.toList());
        log.info(output.toString());
    }

}
