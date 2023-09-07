package lesson11Task1;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NumbersCalculator {
    public static void main(String[] args) {
        getNumbersDivisibeBy3(List.of(3, 5, 9, 11, 15, 17, 18, 20, 25));
    }

    public static List<Integer> getNumbersDivisibeBy3(List<Integer> numbers) {
        List<Integer> listOfFilterdNumbers = numbers.stream()
                .filter(number -> number % 3 == 0)
                .collect(Collectors.toList());
        System.out.println("Numbers are divisible by 3: " + listOfFilterdNumbers);

        return listOfFilterdNumbers;
    }
}
