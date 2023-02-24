package homework_7.Hovhannes_Gspeyan;

import homework_7.Hovhannes_Gspeyan.palmetto.menu.*;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer pedro = new Customer();
        pedro.setName("Pedro");
        pedro.setPhoneNumber("+37444544545");

        MenuItem[] items = new MenuItem[3];
        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};
        Pizza pizza = new Pizza("Margarita", PizzaType.CALZONE, ingredients, 3);
        pizza.addIngredient(Ingredient.BACON);
        pizza.addIngredient(Ingredient.CORN);
        pizza.addIngredient(Ingredient.GARLIC);
        pizza.addIngredient(Ingredient.OLIVES);
        pizza.addIngredient(Ingredient.PEPPERONI);
        pizza.setCustomer(pedro);
        Pizza pepperoniOro = new Pizza("PepperoniOro", PizzaType.CALZONE, ingredients, 2);
        pepperoniOro.addIngredient(Ingredient.CHEESE);

        Drink drink = new Drink(DrinkType.SODA_DRINK, 2);
        items[0] = pizza;
        items[1] = pepperoniOro;
        items[2] = drink;

        Order order = Order.createOrder(items, pedro);
        Printer.printCheck(order);


        MenuItem[] items1 = new MenuItem[3];
        Ingredient[] ingredients1 = {Ingredient.GARLIC, Ingredient.BACON, Ingredient.TOMATO_PASTE};
        Pizza pizza1 = new Pizza("MyPizza", PizzaType.CALZONE, ingredients1, 3);
        Pizza pepperoni = new Pizza("PepperoniOro", PizzaType.REGULAR, ingredients1, 2);
        pizza1.setCustomer(pedro);
        pepperoni.setCustomer(pedro);
        Drink drink1 = new Drink(DrinkType.ALCOHOL_DRINK, 2);

        items1[0] = pizza1;
        items1[1] = pepperoni;
        items1[2] = drink1;

        Order order1 = Order.createOrder(items1, pedro);
        Printer.printCheck(order1);

        Customer marko = new Customer();
        marko.setName("Marko");
        marko.setPhoneNumber("+37444544546");

        MenuItem[] items2 = new MenuItem[4];
        Ingredient[] ingredients2 = {Ingredient.CORN, Ingredient.OLIVES, Ingredient.PEPPERONI};
        Ingredient[] ingredients3 = {Ingredient.BACON, Ingredient.OLIVES, Ingredient.PEPPERONI};
        Pizza pizza2 = new Pizza("Dia", PizzaType.CALZONE, ingredients2, 3);
        Pizza pizza3 = new Pizza("Carlo", PizzaType.REGULAR, ingredients3, 2);
        pizza2.setCustomer(marko);
        pizza3.setCustomer(marko);
        Drink drink2 = new Drink(DrinkType.JUICE_DRINK, 2);
        Drink drink3 = new Drink(DrinkType.MINERAL_DRINK, 2);

        items2[0] = pizza2;
        items2[1] = pizza3;
        items2[2] = drink2;
        items2[3] = drink3;

        Order order2 = Order.createOrder(items2, marko);
        Printer.printCheck(order2);
    }
}
