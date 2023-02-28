package homework_7.aram;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Aram");
        customer.setPhoneNumber("+37498000000");
        Ingredient[] ingredients1 = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};

        Pizza pizza1 = new Pizza("MyPizza1", PizzaType.CALZONE, ingredients1, 1,ProductType.PIZZA);
        pizza1.addIngredient(Ingredient.PEPPERONI);

        Drink drink=new Drink("Fanta",DrinkType.FANTA,3,ProductType.DRINK);
        Order order = new Order();
        order.setCustomer(customer);
        order.addProduct(pizza1);
        order.addProduct(drink);
        Printer.printCheck(order);
    }
}
