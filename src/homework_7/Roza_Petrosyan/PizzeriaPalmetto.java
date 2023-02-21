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


        order.addProduct("Margarita", PizzaType.CALZONE, ingredients, 1);
        order.addProduct("MyPizza2", PizzaType.REGULAR, ingredients2, 5);

        Pizza pizza2 = (Pizza) order.getProducts()[1];


        pizza2.addIngredient(Ingredient.Corn);
        pizza2.addIngredient(Ingredient.Pepperoni);
        pizza2.addIngredient(Ingredient.Olives);


        order.addProduct("Sprite", DrinkType.FIZZY, null, 2);
        order.printOrderAttributes();


        Printer.printCheck(order);
    }
}
