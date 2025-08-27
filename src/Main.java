import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Ingredient> cake = new ArrayList<>();
        cake.add(new Ingredient("Harina", 2000));
        cake.add(new Ingredient("Azucar", 1500));
        cake.add(new Ingredient("Levadura", 4000));
        cake.add(new Ingredient("Fresas", 3000));
        Dish dessert1 = new Dessert("Cake", cake, true, false, 300);

        List<Ingredient> pie = new ArrayList<>();
        pie.add(new Ingredient("Crema de leche", 4500));
        pie.add(new Ingredient("Limones", 4000));
        pie.add(new Ingredient("Leche", 3100));
        pie.add(new Ingredient("Lechera", 4500));
        Dish dessert2 = new Dessert("Lemon Pie", pie, false, true, 400);

        List<Ingredient> pizza = new ArrayList<>();
        pizza.add(new Ingredient("Sal", 1000));
        pizza.add(new Ingredient("Jamon", 4000));
        pizza.add(new Ingredient("Queso", 3000));
        Dish food1 = new Food("Pizza", pizza, false, true);

        List<Ingredient> pasta = new ArrayList<>();
        pasta.add(new Ingredient("Tomate", 4000));
        pasta.add(new Ingredient("Pasta", 3000));
        pasta.add(new Ingredient("Parmesano", 3000));
        Dish food2 = new Food("Pasta", pasta, true, true);

        List<Ingredient> limonada = new ArrayList<>();
        limonada.add(new Ingredient("Agua", 2000));
        limonada.add(new Ingredient("Limones", 1000));
        Dish drink1 = new Drink("Limonada", limonada, false, true, false);

        List<Ingredient> cerveza = new ArrayList<>();
        cerveza.add(new Ingredient("Cevada", 5000));
        Dish drink2 = new Drink("Cerveza", cerveza, false, false, true);

        ArrayList<Dish> dishes = new ArrayList<>();
        dishes.add(drink1);
        dishes.add(drink2);
        dishes.add(food1);
        dishes.add(food2);
        dishes.add(dessert1);
        dishes.add(dessert2);

        double money = 100000;

        boolean exit = false;
        System.out.println("Bienvenido a mi restaurante");
        while (!exit) {
            System.out.println("1. Dinero disponible\n" +
                                "2. Inventario de ingredientes\n" +
                                "3. Ver menú\n" +
                                "4. Comprar un plato\n" +
                                "5. Salir\n");

            Scanner input = new Scanner(System.in);
            int opc = input.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("La cantidad de dinero disponible es: $" + money);
                    break;

                case 2:
                    System.out.println("¿De qué plato desea saber los ingredientes?: \n");
                    int j = 1;
                    for(Dish  d : dishes){
                        System.out.print(j + ". ");
                        System.out.println(d.getName());
                        j++;
                    }

                    int plato = input.nextInt();
                    Dish choose = dishes.get(plato - 1);
                    choose.getIngredientList();
                    break;

                case 3:
                    System.out.println("Menú disponible: \n");
                    int i = 1;
                    for(Dish  d : dishes){
                        System.out.print(i + ". ");
                        d.print();
                        i++;
                    }
                    break;

                case 4:
                    System.out.println("Seleccione un plato: \n");
                    int f = 1;
                    for(Dish  d : dishes){
                        System.out.print(f + ". ");
                        d.print();
                        f++;
                    }

                    int menu = input.nextInt();
                    Dish choose2 = dishes.get(menu - 1);
                    System.out.println("Se ha comprado el plato " + choose2.getName());
                    money -= choose2.calculateCost();
                    break;

                case 5:
                    exit = true;
            }
        }
    }
}