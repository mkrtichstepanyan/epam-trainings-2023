package homework_7.Hovhannes_Gspeyan.palmetto;

import homework_7.Hovhannes_Gspeyan.palmetto.exception.*;
import homework_7.Hovhannes_Gspeyan.palmetto.menu.*;

public class PalmettoDemo {
    public static void main(String[] args) throws PizzaQuantityFullException {
        Customer customer = new Customer();
        try{
            customer.setName("John1");
            customer.setPhoneNumber("+37444000000l");
        }catch (InvalidNameException | InvalidPhoneNumberException e){
            System.out.println(e.getMessage());
        }
        Customer customer1 = new Customer();
        customer1.setName("Lari");
        customer1.setPhoneNumber("+37444000001");

        Ingredient[] ingredients = {Ingredient.CORN, Ingredient.BACON, Ingredient.GARLIC};
        Ingredient[] ingredients1 = {Ingredient.TOMATO_PASTE, Ingredient.PEPPERONI, Ingredient.GARLIC};
        Ingredient[] ingredients2 = {Ingredient.OLIVES, Ingredient.SALAMI, Ingredient.GARLIC};
        Ingredient[] ingredients3 = {Ingredient.SALAMI, Ingredient.BACON, Ingredient.TOMATO_PASTE};

        Pizza pizza3 = null;
        Pizza pizza = null;
        Pizza pizza1 = null;
        Pizza pizza2 = null;
        try {
            pizza = new Pizza("Margarita", PizzaType.CALZONE, ingredients, 5);
            pizza1 = new Pizza("Pepperoni", PizzaType.CALZONE, ingredients1, 5);
            pizza2 = new Pizza("Diablo", PizzaType.CALZONE, ingredients2, 5);
            pizza3 = new Pizza("Mar", PizzaType.CALZONE, ingredients3, 5);
            pizza3.setCustomer(customer1);
            try {
                pizza2.addIngredient(Ingredient.OLIVES);
                pizza2.addIngredient(Ingredient.CHEESE);
                pizza2.addIngredient(Ingredient.CORN);
                pizza2.addIngredient(Ingredient.TOMATO_PASTE);
                pizza2.addIngredient(Ingredient.PEPPERONI);
                pizza2.addIngredient(Ingredient.BACON);
            } catch (IngredientFullException | IngredientDuplicateException e) {
                System.out.println(e.getMessage());
            }
        } catch (PizzaQuantityFullException e) {
            System.out.println(e.getMessage());
        }


        Drink drink1 = new Drink(DrinkType.SODA_DRINK, 4);
        Drink drink2 = new Drink(DrinkType.JUICE_DRINK, 4);
        Drink drink3 = new Drink(DrinkType.MINERAL_DRINK, 4);
        Drink drink4 = new Drink(DrinkType.ALCOHOL_DRINK, 4);


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
        try {
            Order order = Order.createOrder(item, customer);
            Printer.printCheck(order);

            Order order1 = Order.createOrder(item1, customer1);
            Printer.printCheck(order1);
        } catch (ItemSizeOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


    }

}
