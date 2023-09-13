package com.sample;

public class ThreadDemo {
    public static void main(String[] args) {
         Runnable r = ()->{System.out.println("null");};    
         new Thread(() -> {}).start();
    }
}
