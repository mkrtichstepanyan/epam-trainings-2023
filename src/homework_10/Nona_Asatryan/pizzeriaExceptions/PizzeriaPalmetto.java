package homework_10.Nona_Asatryan.pizzeriaExceptions;

import homework_10.Nona_Asatryan.pizzeriaExceptions.customExceptions.InvalidNameException;
import homework_10.Nona_Asatryan.pizzeriaExceptions.customExceptions.InvalidPhoneNumberException;
import homework_10.Nona_Asatryan.pizzeriaExceptions.customExceptions.ProductQuantityException;
import homework_10.Nona_Asatryan.pizzeriaExceptions.customExceptions.ProductTypeException;

public class PizzeriaPalmetto {

    public static void main(String[] args) throws ProductTypeException, IllegalAccessException {
        Customer customer = new Customer();
        try {
            customer.setName("Sevak");
            customer.setPhoneNumber("+37498000000");
        } catch (InvalidNameException | InvalidPhoneNumberException e) {
            System.out.println(e.getMessage());
        }
        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};

        Product pizza = null;
        Product pizza1 = null;
        try {
            pizza = new Pizza("MyPizza", PizzaType.CALZONE, ingredients, 10, ProductType.PIZZA);
            pizza1 = new Pizza("MyPizza2", PizzaType.REGULAR, ingredients, 5, ProductType.PIZZA);
        } catch (ProductQuantityException e) {
            throw new RuntimeException(e);
        }
        try {
            order.addProduct(pizza);
            order.addProduct(pizza1);
        } catch (ProductTypeException | ProductQuantityException e) {
            throw new RuntimeException(e);
        }
        Printer.printCheck(order);

        Ingredient[] ingredientsForMargarita = {Ingredient.TOMATO_PASTE, Ingredient.PEPPERONI, Ingredient.GARLIC, Ingredient.BACON};
        Ingredient[] ingredientsForPepperoniOro = {Ingredient.TOMATO_PASTE, Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.OLIVES};
        Ingredient[] ingredientsForBasePZZ = {Ingredient.CHEESE, Ingredient.GARLIC, Ingredient.CORN, Ingredient.OLIVES};

        Customer customer1 = new Customer();
        try {
            customer1.setName("John");
            customer.setPhoneNumber("+3749800000");
        } catch (InvalidNameException | InvalidPhoneNumberException e) {
            throw new RuntimeException(e);
        }
        Order firstOrder = new Order();
        firstOrder.setCustomer(customer1);
        Pizza pizza2 = null;
        Pizza pizza3 = null;
        Pizza pizza4 = null;
        try {
            pizza2 = new Pizza("Margarita", PizzaType.CALZONE, ingredientsForMargarita, 2, ProductType.PIZZA);
            pizza3 = new Pizza("PepperoniOro", PizzaType.CALZONE, ingredientsForPepperoniOro, 3, ProductType.PIZZA);
            pizza4 = new Pizza("BasePZZ", PizzaType.REGULAR, ingredientsForBasePZZ, 9, ProductType.PIZZA);
        } catch (ProductQuantityException e) {
            throw new RuntimeException(e);
        }

        pizza2.addIngredient(Ingredient.CHEESE);
        pizza3.addIngredient(Ingredient.CORN);
        pizza4.addIngredient(Ingredient.GARLIC);
        try {
            firstOrder.addProduct(pizza2);
            firstOrder.addProduct(pizza3);
            firstOrder.addProduct(pizza4);
        } catch (ProductTypeException | ProductQuantityException e) {
            throw new RuntimeException(e);
        }
        Printer.printCheck(firstOrder);


        Customer customer2 = new Customer();
        try {
            customer2.setName("Jack");
        } catch (InvalidNameException e) {
            throw new RuntimeException(e);
        }
        Order secondOrder = new Order();
        secondOrder.setCustomer(customer2);
        Pizza margarita1 = null;
        Product drink1 = null;
        Product drink2 = null;
        Product drink3 = null;
        try {
            margarita1 = new Pizza("Margarita", PizzaType.CALZONE, ingredientsForMargarita, 2, ProductType.PIZZA);
            drink1 = new Drink("Juice", DrinkType.JUICE, 3);
            drink2 = new Drink("Beer", DrinkType.BEER, 1);
            drink3 = new Drink("Coca Cola", DrinkType.COCA_COLA, 1);
        } catch (ProductQuantityException e) {
            throw new RuntimeException(e);
        }
        try {
            secondOrder.addProduct(margarita1);
            secondOrder.addProduct(drink1);
            secondOrder.addProduct(drink2);
            secondOrder.addProduct(drink3);
        } catch (ProductTypeException | ProductQuantityException e) {
            throw new RuntimeException(e);
        }
        Printer.printCheck(secondOrder);
    }
}
