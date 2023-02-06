package homework_5.garik_gharibyan.pizza;

public class main {
    public static void main(String[] args) {

        Customer customer = new Customer("Jon", 7717);

        Pizza[] pizzas = new Pizza[2];
        pizzas[0] = new Pizza("Margarita",2,PizzaType.closed);
        pizzas[1] = new Pizza("Europa",3,PizzaType.regular);

        Order order1 = Order.makeOrder(pizzas, customer);

        order1.getInfo();
        order1.getPizzas()[0].addIngredient(Ingredient.tomato_paste);
        order1.getPizzas()[0].addIngredient(Ingredient.peperoni);
        order1.getPizzas()[0].addIngredient(Ingredient.garlic);
        order1.getPizzas()[0].addIngredient(Ingredient.bacon);

        order1.getPizzas()[1].addIngredient(Ingredient.tomato_paste);
        order1.getPizzas()[1].addIngredient(Ingredient.cheese);
        order1.getPizzas()[1].addIngredient(Ingredient.salami);
        order1.getPizzas()[1].addIngredient(Ingredient.olives);

    }
}
