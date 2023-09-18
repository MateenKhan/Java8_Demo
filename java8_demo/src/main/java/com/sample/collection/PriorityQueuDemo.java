package com.sample.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

import com.sample.collection.Employee.EmployeeBuilder;

import lombok.Builder;
import lombok.Value;
import lombok.val;

public class PriorityQueuDemo {
    public static void main(String[] args) {
        Employee e1 = new EmployeeBuilder().id("a1").age(20).rank(3).name("Alpha").build();
        Employee e2 = new EmployeeBuilder().id("a2").age(21).rank(1).name("Beta").build();
        Employee e3 = new EmployeeBuilder().id("a3").age(22).rank(2).name("Gama").build();

        PriorityQueue<Employee> p1 = new PriorityQueue<>(new Comparator<Employee>() {
            public int compare(Employee obj1, Employee obj2) {
                int value = obj2.getAge() - obj1.getAge();
                if (value > 0)
                    value = 1;
                else if (value < 0)
                    value = -1;
                else if (value == 0)
                    value = 0;
                return value;
            }
        });
        p1.add(e1);
        p1.add(e2);
        p1.add(e3);
        while (!p1.isEmpty()) {
            System.out.println(p1.poll());  
        }
    }

}

@Value
@Builder
class Employee {

    String id, name;
    int rank, age;

    @Override
    public boolean equals(Object obj) {
        return ((Employee) obj).id == this.id;
    }
    @Override
    public int hashCode() {
        return age;
    }

    
    

}

class Demo<T>{

    void add(T input){
        ArrayList al = new ArrayList<T>();
        al.add(input);
    }
}