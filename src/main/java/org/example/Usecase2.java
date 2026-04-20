package org.example;

public class Usecase2 {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello + args[0]");
        }
        else {
            System.out.println("Hello (no name was provided)");
        }
    }
}