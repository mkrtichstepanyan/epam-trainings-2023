package homework_7.Radik_Manasyan;

public class PizzeriaPalmetto {

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

        Printer.printCheck(order);

        Customer customer1 = new Customer();
        customer1.setCurrency("DRAM");

        OrderPizza order1 = new OrderPizza();
        order1.setCustomer(customer1);

        order1.add("My Favorite Pizza", PizzaType.CALZONE, 1);

        Printer.printCheck(order1);

    }
}
