package lesson11Task2;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;


public class PizzaMenu {
    public static void main(String[] args) {

        List<Pizza> pizzaMenu = new ArrayList<>();
        pizzaMenu.add(new Pizza(true, Arrays.asList("mozzarella", "tomato"), 500, "Margherita"));
        pizzaMenu.add(new Pizza(false, Arrays.asList("mozzarella", "tomato", "salami"), 600, "Pepperoni"));
        pizzaMenu.add(new Pizza(false, Arrays.asList("mozzarella", "salami", "bell pepper"), 620, "Diavola"));
        pizzaMenu.add(new Pizza(true, Arrays.asList("mozzarella", "mushrooms", "bell pepper", "tomato"), 550, "Ortolana"));
        pizzaMenu.add(new Pizza(true, Arrays.asList("tomato", "mushrooms", "bell pepper", "celery"), 450, "Pizza Vegana"));
        pizzaMenu.add(new Pizza(false, Arrays.asList("tomato", "mushrooms", "salami"), 580, "Calzone Classico"));
        pizzaMenu.add(new Pizza(false, Arrays.asList("mozzarella", "tomato", "onion", "salami"), 700, "Tonno"));
        pizzaMenu.add(new Pizza(false, Arrays.asList("mozzarella", "salami", "mushrooms", "tomato"), 800, "Salami Feast"));


        List<String> vegetarianDishes = pizzaMenu.stream()
                .filter(Pizza::isVegetarian)
                .map(Pizza::getName)
                .collect(Collectors.toList());
        System.out.println("Vegetarian Dishes: " + vegetarianDishes);


        List<String> allergenDishes = pizzaMenu.stream()
                .filter(pizza -> pizza.getIngredients().contains("celery"))
                .map(Pizza::getName)
                .collect(Collectors.toList());
        System.out.println("Allergen Dishes: " + allergenDishes);

        boolean containsTomatoAndBellPepper = pizzaMenu.stream()
                .anyMatch(pizza -> pizza.isVegetarian() && pizza.getIngredients().containsAll(Arrays.asList("tomato", "bell pepper")));
        System.out.println("Contains tomato and bell pepper " + containsTomatoAndBellPepper);

        boolean allContainsMozzarella = pizzaMenu.stream()
                .allMatch(pizza -> pizza.getIngredients().contains(Arrays.asList("mozzarella")));
        System.out.println("All contains mozzarella " + allContainsMozzarella);

        Optional<Pizza> highestCaloriePizza = pizzaMenu.stream()
                .max(Comparator.comparingInt(Pizza::getCalories));
        highestCaloriePizza.ifPresent(pizza -> System.out.println("The highest calorie pizza is " + pizza.getName()));


        Optional<Pizza> lowestCaloriePizza = pizzaMenu.stream()
                .min(Comparator.comparingInt(Pizza::getCalories));
        lowestCaloriePizza.ifPresent(pizza -> System.out.println("The lowest calorie pizza is " + pizza.getName()));
    }

}




