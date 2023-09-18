package com.sample.collection;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Employee {

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