package homework_5.Zara_Avetyan;

import java.util.Scanner;

public class Pizza {
    private String orderName;
    private int chooseType;
    private int count;
    private int[] chooseIngr;
    PizzaTypeAndCount pizzaTypeAndCount = new PizzaTypeAndCount();
    private static String customerName = new Customer().customerName();

    static PizzaTypeAndCount[] pizzaType = {
            new PizzaTypeAndCount("Regular", 1),
            new PizzaTypeAndCount("Calzone", 1.5),
    };

    static Ingredients[] ingr = {
            new Ingredients("Tomato paste", 1),
            new Ingredients("Cheese", 1),
            new Ingredients("Salami", 1.5),
            new Ingredients("Bacon", 1.2),
            new Ingredients("Garlic", 0.3),
            new Ingredients("Corn", 0.7),
            new Ingredients("Pepperoni", 0.6),
            new Ingredients("Olives", 0.5),
    };


    public void loading() {
        orderName = new Order().orderName();
        chooseIngr = new Ingredients().chooseIngredients();
        chooseType = pizzaTypeAndCount.chooseType();
        count = pizzaTypeAndCount.count();

        anotherPizza();
        Print print = new Print();
        print.print(orderName, chooseType, chooseIngr, count);
    }

    public void anotherPizza() {
        System.out.print("Do you want to order another pizza? press y/n: ");
        if (new Scanner(System.in).next().equals("y")) {
           new Pizza().loading();
        }
    }
}
