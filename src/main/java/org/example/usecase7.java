package org.example;

public class usecase7 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello");
            return;
        }

        StringBuilder sb = new StringBuilder("Hello, ");

        for (String arg : args) {
            sb.append(arg).append(",");
        }

        String result = sb.substring(0, sb.length() - 1);

        System.out.println(result);
    }
}
