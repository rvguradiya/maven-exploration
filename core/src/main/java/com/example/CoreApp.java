package com.example;

public class CoreApp {

    public static String processMessage(String message) {
        return "Core Processed: " + message;
    }

    public static void main(String[] args) {
        System.out.println(processMessage("Hello from Core!"));
    }
}

