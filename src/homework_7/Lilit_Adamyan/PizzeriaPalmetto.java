package homework_7.Lilit_Adamyan;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer("John");
        customer.setPhoneNumber("+37498000000");
        Pizza margarita = new Pizza("Margarita",PizzaType.REGULAR,2);
        Order order = new Order();
        order.setCustomer(customer);
        margarita.addIngredient(Ingredient.SALAMI);
        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI};
        order.addPizza("MyPizza", PizzaType.CALZONE, ingredients, 1);
        order.addPizza("MyPizza2", PizzaType.REGULAR, ingredients, 1);
        order.printOrderAttributes();
        Printer.printCheck(order);
    }
}
