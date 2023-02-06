package homework_5.garik_gharibyan.pizza;

public class main {
    public static void main(String[] args) {

        Customer customer = new Customer("Jon", 7717);
        Pizza[] pizzas = new Pizza[2];

        pizzas[0] = new Pizza("Margarita", 2, PizzaType.closed);
        pizzas[0].addIngredient(Ingredient.tomato_paste);
        pizzas[0].addIngredient(Ingredient.peperoni);
        pizzas[0].addIngredient(Ingredient.garlic);
        pizzas[0].addIngredient(Ingredient.bacon);

        pizzas[1] = new Pizza("Europa", 3, PizzaType.regular);
        pizzas[1].addIngredient(Ingredient.tomato_paste);
        pizzas[1].addIngredient(Ingredient.cheese);
        pizzas[1].addIngredient(Ingredient.salami);
        pizzas[1].addIngredient(Ingredient.olives);

        Order order = Order.makeOrder(pizzas, customer);

        order.pizzaAttributes();
        order.printCheck();


    }
}
