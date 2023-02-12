package homework_5.Hovhannes_Abrahamyan.pizzeria;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(55555);
        Customer customer = new Customer(i, "Narek", "099999999");
        Ingredient[] ingredients = new Ingredient[3];
        ingredients[0] = Ingredient.GetBacon();
        ingredients[1] = Ingredient.GetCorn();
        ingredients[2] = Ingredient.getCheese();
        Pizza pizza = new Pizza("Calzone", PizzaType.CLOSED, ingredients, 1);
        Pizza pizza2 = new Pizza("Calzone", PizzaType.CLOSED, ingredients, 2);
        i = random.nextInt(11111);
        Order order = new Order(i, customer, new Pizza[]{pizza,pizza2});
        System.out.println(CheckPrinter.printCheck(order));

    }

}