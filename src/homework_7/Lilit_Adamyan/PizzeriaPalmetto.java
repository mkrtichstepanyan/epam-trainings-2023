package homework_7.Lilit_Adamyan;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer("John");
        customer.setPhoneNumber("+37498000000");
        Pizza margarita = new Pizza("Margarita",PizzaType.CALZONE,2);
        margarita.addIngredient(Ingredient.CORN);
        margarita.addIngredient(Ingredient.PEPPERONI);
        margarita.addIngredient(Ingredient.GARLIC);
        margarita.addIngredient(Ingredient.BACON);

        Order order = new Order();
        order.setCustomer(customer);
        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI};
        order.addPizza("MyPizza", PizzaType.CALZONE, ingredients, 1);
        //pizzai anunn@ paymanin bavarareg@ jon@ um dran shunne?
        order.printOrderAttributes();
        Printer.printCheck(order);
    }
}
