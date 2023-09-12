package com.sample;

public class Function_Argument {
    public static void main(String[] args) {
        Printer p = (String input) -> System.out.println(input);
        test(p);
    }

    public static void test(Printer p) {
        p.print("Hello world");
    }
}


interface Printer {
    void print(String input);
}