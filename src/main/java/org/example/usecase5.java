package org.example;

public class usecase5 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, Guest!");
        } else {
            System.out.println("Hello, Everyone:");
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}
