package lesson11Task2;
import java.util.List;
public class Pizza {
    private boolean vegetarian;
    private List<String>ingredients;
    private int calories;
    private String name;


    public Pizza(boolean vegetarian, List<String> ingredients, int calories, String name) {
        this.vegetarian = vegetarian;
        this.ingredients = ingredients;
        this.calories = calories;
        this.name = name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public int getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }
}
