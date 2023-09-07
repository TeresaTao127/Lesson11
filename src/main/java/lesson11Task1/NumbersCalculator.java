package lesson11Task1;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NumbersCalculator {
    public static void main(String[] args) {
        getNumbersDivisibeBy3(List.of(3, 6, 9, 10, 15, 17, 18, 20, 21));

    }

    public static   Set<Integer> getNumbersDivisibeBy3(List<Integer> numbers) {


            Set<Integer> setOfFilterdNumbers = numbers.stream()
                    .filter(number -> number % 3 == 0)
                    .collect(Collectors.toSet());
            System.out.println("Numbers are divisible by 3: " + setOfFilterdNumbers);

            return setOfFilterdNumbers;

    }
}
