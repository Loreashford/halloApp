package org.example;

public class usecase6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String delimiter = ",";

        for (String arg : args) {
            sb.append(arg).append(delimiter);
        }

        String result = sb.toString();

        if (result.length() > 0 && result.endsWith(delimiter)) {
            result = result.substring(0, result.length() - 1);
        }

        // Replace remaining delimiters with spaces if needed
        System.out.println(result.replace(",", " "));
    }
}
