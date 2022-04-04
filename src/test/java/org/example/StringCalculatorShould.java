package org.example;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/*
1. The method can take 0, 1 or 2 numbers, and will return their sum
(for an empty string it will return 0)
for example
“” == 0 , “1” == 1 , “1,2” == 3
2. Start with the simplest test case of an empty string and move to one & two
numbers
3. Remember to solve things as simply as possible so that you force yourself to
write tests you did not think about
4. Remember to refactor after each passing test
* */


/*

 *  1 -> 1
 *  "1,2" -> 3

 *  "" -> 0
 *  "  " -> 0

 *  "1,,2" -> 3
 *  "1,2,A" -> 3
 *  "1,1 ,2" -> 3

 *
 *  */


public class StringCalculatorShould {
    StringCalculator stringCalculator;

    @BeforeEach
    void setup() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void return_the_same_number_given_a_single_number() {
        assertThat(stringCalculator.sumOf("2")).isEqualTo(2);
    }

    @Test
    void return_zero_given_an_empty_line() {
        assertThat(stringCalculator.sumOf("")).isEqualTo(0);
        assertThat(stringCalculator.sumOf(" ")).isEqualTo(0);
    }

    @Test
    void ignore_not_integer_numbers(){
        assertThat(stringCalculator.sumOf("1,1,,")).isEqualTo(2);
        assertThat(stringCalculator.sumOf("1,1,a,2")).isEqualTo(4);
        assertThat(stringCalculator.sumOf("1,1 ,2")).isEqualTo(4);
        assertThat(stringCalculator.sumOf("1,2.5")).isEqualTo(1);
        assertThat(stringCalculator.sumOf("2.5")).isEqualTo(0);
    }
}
