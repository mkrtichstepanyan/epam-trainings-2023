package homework_7.Roza_Petrosyan;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");

        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.TOMATO_PASTE, Ingredient.Bacon, Ingredient.Garlic};
        Ingredient[] ingredients2 = {};


        Pizza pizza1 = new Pizza("MyPizza", PizzaType.CALZONE, ingredients, 10);
        Pizza pizza2 = new Pizza("MyPizza2", PizzaType.REGULAR, ingredients2, 5);

        order.addProduct(pizza1,"pizza");
        order.addProduct(pizza2, "pizza");


        order.getPizzas()[1].addIngredient(Ingredient.Corn);
        order.getPizzas()[1].addIngredient(Ingredient.Pepperoni);
        order.getPizzas()[1].addIngredient(Ingredient.Olives);

        Drink drink1 = new Drink("Sprite", DrinkType.FIZZY, 2);

        order.addProduct(drink1, "drink");
        order.printOrderAttributes();


        Printer.printCheck(order);
    }
}
