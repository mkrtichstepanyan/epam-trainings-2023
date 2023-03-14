package homework_10.Anush_Ananyan.Pizza.Pizzeria;


import homework_10.Anush_Ananyan.Pizza.Exceptions.CustomerNameException;
import homework_10.Anush_Ananyan.Pizza.Exceptions.PhoneNumberException;
import homework_10.Anush_Ananyan.Pizza.Exceptions.QuantityException;


public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        try {
            customer.setName("sh");
        } catch (CustomerNameException e) {
            System.out.println(e);
        }

        try {
            customer.setPhoneNumber("+3749800");
        } catch (PhoneNumberException p) {
            System.out.println(p);
        }

        Order order = new Order();

        order.setCustomer(customer);
        Pizza pizza = new Pizza("NewPizza", PizzaType.REGULAR, 5);


        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};
        Ingredient[] ingredients1 = {Ingredient.BACON, Ingredient.CHEESE, Ingredient.OLIVES, Ingredient.CORN,
                Ingredient.GARLIC, Ingredient.PEPPERONI, Ingredient.TOMATO_PASTE};
        Ingredient[] ingredients2 = {Ingredient.BACON, Ingredient.CHEESE, Ingredient.OLIVES, Ingredient.CORN,
                Ingredient.GARLIC, Ingredient.PEPPERONI, Ingredient.BACON};
        Ingredient[] ingredients3 = {Ingredient.BACON, Ingredient.CHEESE, Ingredient.OLIVES, Ingredient.CORN,
                Ingredient.GARLIC, Ingredient.PEPPERONI, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};

//        pizza.addIngredients(ingredients2);
//        pizza.addIngredients(ingredients3);

        try {
            order.addProduct("MyPizza", PizzaType.CALZONE, ingredients, 11);
        } catch (QuantityException e) {
            System.out.println(e);
        }

        try {
            order.addProduct("125", PizzaType.REGULAR, ingredients1, 5);
        } catch (QuantityException e) {
            System.out.println(e);
        }

        try {
            order.addProduct("MySalad", SaladType.FRUIT, null, 3);
        } catch (QuantityException e) {
            System.out.println(e);
        }

        Printer.printCheck(order);
        order.calculateOrderPrice();
    }
}