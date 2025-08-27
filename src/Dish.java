
import java.util.List;

public abstract class Dish {
    protected String name;
    protected List<Ingredient> ingredients;
    protected double price;

    public Dish(String name, List<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
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

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public double getIngredientPrice() {
        double cost = 0;
        for (Ingredient i : getIngredients()){
            cost += i.getPrice();
        }
        return cost;
    }

    public void getIngredientList(){
        for (Ingredient i : getIngredients()){
            System.out.println("- " + i.getName());
        }
    }

    public void print(){
        System.out.println(getName() + ": " + calculateCost() + "\n");
    }

    public abstract double calculateCost();
}