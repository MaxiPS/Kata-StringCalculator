package org.example;
import java.util.List;

public class StringCalculator {


    public int sumOf(String line) {
        List<String> values = List.of(line.split(","));
        return calculate(values);
    }

    private int calculate(List<String> values) {
        int result = 0;
        for (String value : values) {
            result += parseInt(value);
        }
        return result;
    }

    private int parseInt(String value) {
        try {
           return Integer.parseInt(value.trim());
        } catch (NumberFormatException ignored) {
            return 0;
        }
    }


}