package com.example;

public class ReflectionExample {
    public static void main(String[] args) {
        // Obtain the Class object for java.lang.String
        Class<?> clazz = String.class;
        
        System.out.println("Class Name: " + clazz.getName());
        System.out.println("Superclass: " + clazz.getSuperclass().getName());
        
        // List all declared methods for the class
        System.out.println("\nDeclared Methods:");
        for (var method : clazz.getDeclaredMethods()) {
            System.out.println(" - " + method.getName());
        }
    }
}