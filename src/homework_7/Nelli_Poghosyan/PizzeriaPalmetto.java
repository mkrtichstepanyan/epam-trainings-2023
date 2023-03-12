package homework_7.Nelli_Poghosyan;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");

        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};

        order.addProduct(new Pizza("MyPizza", PizzaType.CALZONE, ingredients, 10));
        order.addProduct(new Pizza("MyPizza2", PizzaType.REGULAR, ingredients, 5));
        order.addProduct(new Drink(DrinkType.VINE_IJEVAN_SWEET, 1));
        order.addProduct(new Drink(DrinkType.VINE_CAGOR_SWEET, 3));

        Printer.printCheck(order);
    }
}
