package homework_10.Liana_Gevorgyan.Pizza;

public class PizzeriaPalmetto {

    public static void main(String[] args) {

        Printer.printSomething(new Menu());

        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");

        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};

        Product pizzaCalzone = new Pizza("MyPizza", PizzaType.CALZONE, ingredients, 10);
        Product pizzaRegular = new Pizza("MyPizza2", PizzaType.REGULAR, ingredients, 5);

        Product darget = new Drink("Darget Apricot", DrinkType.BEER, 2, 1);
        Product ararat = new Drink("Ararat", DrinkType.BRANDY, 20, 1);

        order.addProduct(pizzaCalzone);
        order.addProduct(pizzaRegular);
        order.addProduct(darget);
        order.addProduct(ararat);

        //Printer.printCheck(order);

        Printer.printSomething(order);
    }
}
