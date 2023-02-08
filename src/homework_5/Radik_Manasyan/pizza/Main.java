package homework_5.Radik_Manasyan.pizza;

public class Main {
    public static void main(String[] args) {
        String ingredient1 = "Tomato Paste, Corn, Garlic, Bacon";
        String ingredient2 = "Tomato Paste, Cheese, Pepperoni, Olives";
        Order order = new Order();
        order.order(7717,"Margarita Calzone", 2);
        order.pizzaAttribute();
        order.addIngredient(ingredient1);
        order.order(7717,"PepperoniOro", 3);
        order.pizzaAttribute();
        order.addIngredient(ingredient2);
        order.printCheck();

    }
}
