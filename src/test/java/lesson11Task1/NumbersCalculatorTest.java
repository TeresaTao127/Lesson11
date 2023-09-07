package lesson11Task1;

import org.junit.jupiter.api.Assertions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumbersCalculatorTest {

    @org.junit.jupiter.api.Test
    void shouldGetNumbersDivisibeBy3() {
        List<Integer> numbers = List.of(3, -100, 6, 8, 9, 16, 128, 210);
        List<Integer> expectedResults = List.of(3, 6, 9, 210);
        Assertions.assertEquals(expectedResults, NumbersCalculator.getNumbersDivisibeBy3(numbers));
    }
}

