package com.sample.collection.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sample.collection.Employee;

import lombok.extern.java.Log;

@Log
public class ListToMapDemo {
    public static void main(String[] args) {
        Employee e1 = Employee.builder().id("1").name("Mateen").build();
        Employee e2 = Employee.builder().id("2").name("Ahmed").build();
        Employee e3 = Employee.builder().id("3").name("Khan").build();

        List<Employee> employees = List.of(e1,e2,e3);
        Map<String,String> map = employees.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
        log.info(map.toString());
    }
}
