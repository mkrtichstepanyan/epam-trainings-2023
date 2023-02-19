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

        order.addPizza("MyPizza", PizzaType.CALZONE, ingredients, 10);
        order.addPizza("MyPizza2", PizzaType.REGULAR, ingredients2, 5);


        order.getPizzas()[1].addIngredient(Ingredient.Corn);
        order.getPizzas()[1].addIngredient(Ingredient.Pepperoni);
        order.getPizzas()[1].addIngredient(Ingredient.Olives);

        order.addDrink("Sprite", DrinkType.FIZZY, 2);
        order.printOrderAttributes();


        Printer.printCheck(order);
    }
}
