package homework_7.Radik_Manasyan;

import homework_7.Radik_Manasyan.customer.Customer;
import homework_7.Radik_Manasyan.orders.OrderIceCream;
import homework_7.Radik_Manasyan.orders.OrderPizza;
import homework_7.Radik_Manasyan.products.Ingredient;
import homework_7.Radik_Manasyan.products.productType.PizzaType;
import homework_7.Radik_Manasyan.products.productType.ProductType;
import homework_7.Radik_Manasyan.utils.PrintOrdersCheck;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Radik");
        customer.setPhoneNumber("+37498000000");
        customer.setCurrency("€");

        OrderPizza order = new OrderPizza();
        order.setCustomer(customer);


        Ingredient[] ingredients = {Ingredient.TOMATO_PASTE, Ingredient.PEPERONI, Ingredient.GARLIC, Ingredient.BACON};
        Ingredient[] ingredients1 = {Ingredient.TOMATO_PASTE, Ingredient.CHEESE, Ingredient.PEPERONI, Ingredient.OLIVES};


        order.add("Margarita", PizzaType.CALZONE, ingredients, 2);
        order.add("PepperoniOro", PizzaType.REGULAR, ingredients1, 3);

        PrintOrdersCheck.printCheck(order);


        Customer customer1 = new Customer();
        customer1.setCurrency("DRAM");

        OrderPizza order1 = new OrderPizza();
        order1.setCustomer(customer1);

        order1.add("My Favorite Pizza", PizzaType.CALZONE, 1);

        ProductType drink = new ProductType("Fanta", 120, 230);
        order1.add("Fanta", drink, 10);

        PrintOrdersCheck.printCheck(order1);


        Customer customer2 = new Customer();
        customer2.setCurrency("USD");

        OrderIceCream iseCream = new OrderIceCream();
        iseCream.setCustomer(customer2);

        ProductType iseCreamType = new ProductType("SpecialForMe", 120, 590);
        iseCream.add("VanilkaMMMMM", iseCreamType, 5);


        PrintOrdersCheck.printCheck(iseCream);

    }
}
