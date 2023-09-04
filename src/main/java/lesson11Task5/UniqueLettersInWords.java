package lesson11Task5;

import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;


public class UniqueLettersInWords {
    public static void main(String[] args) {

        List<String> words = List.of("ArtificialIntelligence", "ComputerGraphics", "Vision", "ArtificialIntelligence", "Animation");

       Set<String> mappedWords=words.stream()
               .distinct()
               .map(word -> word.replace("t","T"))
               .filter(word -> word.contains("T"))
               .collect(Collectors.toSet());

        System.out.println(mappedWords);

    }
}
