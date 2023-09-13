package com.sample.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

public class MapToList {
    public static void main(String[] args) {
        List<ListItem> list = new ArrayList<>();
        IntStream.range(0, 5)
                .forEach(i -> {
                    list.add(new ListItem(i + "-k", i + "-v"));
                });
        Map<String,String> map = new HashMap<>();
        list.forEach(i->map.put(i.key, i.value));
        System.out.println(map);
    }
}

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
class ListItem {
    String key, value;
}
