package homework_7.Nelli_Poghosyan;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");

        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};

        order.addPizza("MyPizza", PizzaType.CALZONE, ingredients, 10);
        order.addPizza("MyPizza2", PizzaType.REGULAR, ingredients, 5);

        order.addDrink(DrinkType.VINE_ARMENIA_DRY, 1);
        order.addDrink(DrinkType.VINE_CAGOR_SWEET, 2);
        Printer.printCheck(order);
    }
}
