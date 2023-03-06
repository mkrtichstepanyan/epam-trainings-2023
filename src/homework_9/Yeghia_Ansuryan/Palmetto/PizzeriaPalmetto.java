package homework_9.Yeghia_Ansuryan.Palmetto;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Elon Musk");
        customer.setPhoneNumber("+18006138840");

        Order order = new Order(customer);

        IngredientPizza[] ingredients = {IngredientPizza.CHEESE, IngredientPizza.SALAMI, IngredientPizza.TOMATO_PASTE};
        Product pizza = new Pizza("Ha", PizzaType.CALZONE, ingredients, 4);
        order.addProduct(pizza);

        Printer.printCheck(order);
    }
}
