import java.util.List;

public class Drink extends Dish {
    private boolean milkshake;
    private boolean juice;
    private boolean alcohol;

    public Drink(String name, List<Ingredient> ingredients, double price, boolean milkshake, boolean juice, boolean alcohol) {
        super(name, ingredients, price);
        this.milkshake = milkshake;
        this.juice = juice;
        this.alcohol = alcohol;
    }

    public boolean isMilkshake() {
        return milkshake;
    }

    public void setMilkshake(boolean milkshake) {
        this.milkshake = milkshake;
    }

    public boolean isJuice() {
        return juice;
    }

    public void setJuice(boolean juice) {
        this.juice = juice;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    public double calculateCost() {
        double cost = getIngredientPrice();

        if(isMilkshake()) {
            cost *= 1.15;
        }
        if(isJuice()) {
            cost *= 1.10;
        }
        if(isAlcohol()) {
            cost += 400;
        }
        return cost;
    }
}