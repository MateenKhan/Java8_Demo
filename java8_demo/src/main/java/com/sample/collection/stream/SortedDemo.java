package com.sample.collection.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
import com.sample.collection.Employee;
@Log
public class SortedDemo {
    public static void main(String[] args) {
        List<Integer> inpList = List.of(1, 22, 13, 41, 5, 63, 71, 8, 9);
        List<Integer> output = inpList.stream().sorted().collect(Collectors.toList());
        log.info(output.toString());
        List<Integer> output2 = inpList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        log.info(output2.toString());
        Employee e1 = Employee.builder().id("a1").age(20).rank(3).name("Alpha").build();
        Employee e2 = Employee.builder().id("a2").age(21).rank(1).name("Beta").build();
        Employee e3 = Employee.builder().id("a3").age(22).rank(2).name("Gama").build();
        List<Employee> employees = List.of(e1,e2,e3);

        List<Employee> output3 = employees.stream().sorted((obj1, obj2) -> obj2.getRank()-obj1.getRank()).collect(Collectors.toList());
        log.info(output3.toString());
        List<Employee> output4 = employees.stream().sorted((o1, o2) -> o1.getAge()-o2.getAge()).collect(Collectors.toList());
        log.info(output4.toString());

    }
}
