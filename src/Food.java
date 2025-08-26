import java.util.List;

public class Food extends Dish {
    private boolean sugar;
    private boolean hot;

    public Food(String name, List<Ingredient> ingredients, double price, boolean sugar, boolean hot) {
        super(name, ingredients, price);
        this.sugar = sugar;
        this.hot = hot;
    }

    public boolean isSugar() { return sugar; }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean isHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }

    public double calculateCost(){

        double cost = getIngredientPrice() * 1.10;

        if(isSugar()){
            cost += 400;
        }
        if(isHot()){
            cost *= 1.20;
        }
        return cost;
    }
}