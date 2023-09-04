package lesson11Task1;

import org.junit.jupiter.api.Assertions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumbersCalculatorTest {

    @org.junit.jupiter.api.Test
    void shouldReturnTrueForCalculateNumbersBy3() {
        Assertions.assertTrue(NumbersCalculator.calculateNumbersBy3(List.of(3, 6, 9, 15, 18, 21)));
    }

    @org.junit.jupiter.api.Test
    void shouldReturnFalseForCalculateNumbersBy3() {
        Assertions.assertFalse(NumbersCalculator.calculateNumbersBy3(List.of(4, 8, 10, 14, 17, 22)));
    }
}