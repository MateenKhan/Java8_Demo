package com.sample.collection;

import java.util.HashMap;
import java.util.Map;

import com.sample.collection.Employee.EmployeeBuilder;

import lombok.extern.java.Log;

@Log
public class HashMapDemo {

    public static void main(String[] args) {
        Employee e1 = Employee.builder().id("a1").age(1).build();
        Employee e2 = Employee.builder().id("a2").age(2).build();
        Employee e3 = Employee.builder().id("a3").age(2).build();
        Employee e4 = Employee.builder().id("a4").age(4).build();

        Map<Employee, Integer> map = new HashMap<Employee, Integer> ();
        map.put(e1, 1111);
        map.put(e2, 22222);
        map.put(e3, 33333);
        map.put(e4, 44444);

        // Map<Integer, Employee> map = new HashMap();
        // map.put(1111, e1);
        // map.put(22222, e1);
        // map.put(33333, e1);
        // map.put(44444, e1);

        log.info(map.toString());
        Boolean result = map.containsKey(e2);
        Boolean result2 = map.containsKey(e1);
        log.info(result.toString());
        log.info(result2.toString());
    }
}
