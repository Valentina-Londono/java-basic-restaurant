
import java.util.List;

public abstract class Dish {
    protected String name;
    protected List<Ingredient> ingredients;
    public double price;

    public Dish(String name, List<Ingredient> ingredients,  double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price + 1000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getIngredientPrice() {
        double cost = 0;
        for (Ingredient i : getIngredients()){
            cost += i.getPrice();
        }
        return cost;
    }

    public abstract double calculateCost();
}