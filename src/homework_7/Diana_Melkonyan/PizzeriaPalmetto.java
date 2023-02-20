package homework_7.Diana_Melkonyan;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");

        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE, Ingredient.PEPPERONI,
        Ingredient.OLIVES, Ingredient.CORN, Ingredient.BACON};

        order.addPizza("MyPizza", PizzaType.CALZONE, ingredients, 10);
        order.addPizza("MyPizza2", PizzaType.REGULAR, ingredients, 5);
        order.addDrink("Cola",DrinkType.Coca_Cola,2);
        Printer.printCheck(order);

    }
}
