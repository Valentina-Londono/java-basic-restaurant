import java.util.List;

public class Dessert extends Dish {
    private boolean cold;
    private boolean hot;
    private int calories;

    public Dessert(String name, List<Ingredient> ingredients, double price, boolean cold, boolean hot, int calories) {
        super(name, ingredients, price);
        this.cold = cold;
        this.hot = hot;
        this.calories = calories;
    }

    public boolean isCold() {
        return cold;
    }

    public void setCold(boolean cold) {
        this.cold = cold;
    }

    public boolean isHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double calculateCost(){
        double cost = getIngredientPrice();
        if (isCold()) {
            cost = cost * 1.12;
        }
        if (isHot()) {
            cost = cost * 1.20;
        }
        return cost;
    }
}