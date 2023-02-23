package homework_7_Hovhannes_Gspeyan.palmetto;

import homework_7_Hovhannes_Gspeyan.palmetto.menu.*;

public class PalmettoDemo {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("John");
        customer.setPhoneNumber("+37444000000");

        Customer customer1 = new Customer();
        customer1.setName("Lari");
        customer1.setPhoneNumber("+37444000001");

        Ingredient[] ingredients = {Ingredient.CORN, Ingredient.BACON, Ingredient.GARLIC};
        Ingredient[] ingredients1 = {Ingredient.TOMATO_PASTE, Ingredient.PEPPERONI, Ingredient.GARLIC};
        Ingredient[] ingredients2 = {Ingredient.OLIVES, Ingredient.SALAMI, Ingredient.GARLIC};
        Ingredient[] ingredients3 = {Ingredient.SALAMI, Ingredient.BACON, Ingredient.TOMATO_PASTE};

        Pizza pizza = new Pizza("Margarita", PizzaType.CALZONE, ingredients, 15);
        Pizza pizza1 = new Pizza("Pepperoni", PizzaType.CALZONE, ingredients1, 5);
        Pizza pizza2 = new Pizza("Diablo", PizzaType.CALZONE, ingredients2, 5);
        Pizza pizza3 = new Pizza("Mar", PizzaType.CALZONE, ingredients3, 5);
        pizza2.addIngredient(Ingredient.OLIVES);
        pizza2.addIngredient(Ingredient.CHEESE);
        pizza2.addIngredient(Ingredient.CORN);
        pizza2.addIngredient(Ingredient.TOMATO_PASTE);
        pizza2.addIngredient(Ingredient.PEPPERONI);
        pizza2.addIngredient(Ingredient.BACON);

        Drink drink1 = new Drink(DrinkType.SODA_DRINK, 4);
        Drink drink2 = new Drink(DrinkType.JUICE_DRINK, 4);
        Drink drink3 = new Drink(DrinkType.MINERAL_DRINK, 4);
        Drink drink4 = new Drink(DrinkType.ALCOHOL_DRINK, 4);

        pizza3.setCustomer(customer);

        MenuItem[] item = new MenuItem[4];
        item[0] = pizza;
        item[1] = pizza3;
        item[2] = drink4;
        item[3] = pizza1;

        MenuItem[] item1 = new MenuItem[4];
        item1[0] = pizza1;
        item1[1] = drink1;
        item1[2] = drink2;
        item1[3] = pizza;

        Order order = Order.createOrder(item, customer);
        order.addPizza(pizza2,11);
        Printer.printCheck(order);

        Order order1 = Order.createOrder(item1,customer1);
        Printer.printCheck(order1);


    }
}
