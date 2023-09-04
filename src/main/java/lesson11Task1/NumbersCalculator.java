package lesson11Task1;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NumbersCalculator {
    public static void main(String[] args) {
        calculateNumbersBy3(List.of(3, 6, 9, 10, 15, 17, 18, 20, 21));

    }

    public static boolean calculateNumbersBy3(List<Integer> numbers) {
        boolean numbersDivisibleBy3=false;
        for (Integer number : numbers) {
            if (number % 3 == 0) {
             numbersDivisibleBy3=true;
             break;
            }
        }

        if (numbersDivisibleBy3) {
            Set<Integer> setOfFilterdNumbers = numbers.stream()
                    .filter(number -> number % 3 == 0)
                    .collect(Collectors.toSet());
            System.out.println("Numbers are divisible by 3: " + setOfFilterdNumbers);
        } else {
            System.out.println("Numbers are not divisible by 3");
        }
        return numbersDivisibleBy3;
    }
}
