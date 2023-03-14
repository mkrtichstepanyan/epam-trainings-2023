package homework_7.Gevorg_Martirosian;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Gevorg");
        customer.setPhoneNumber("+37498000000");

        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};
        Ingredient[] ingredients2 = {Ingredient.BACON, Ingredient.CORN, Ingredient.OLIVES};

        order.addPizza("MyPizza", PizzaType.CALZONE, ingredients, 10);
        order.addPizza("MyPizza2", PizzaType.REGULAR, ingredients2, 5);
        order.addPizza(Pizza.MARGARITA.getName(), PizzaType.REGULAR, ingredients2, 5);
        order.getPizzas()[0].addIngredient(Ingredient.PEPPERONI);
        order.getPizzas()[1].addIngredient(Ingredient.BACON);
        order.getPizzas()[1].addIngredient(Ingredient.GARLIC);

        Printer.printCheck(order);
    }
}
