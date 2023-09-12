package com.sample;

public class Main {
    public static void main(String[] args) {
        Printer p = (String input) -> System.out.println(input);
        p.print("asdf");

    }
}

interface Printer{
    void print(String input);
}