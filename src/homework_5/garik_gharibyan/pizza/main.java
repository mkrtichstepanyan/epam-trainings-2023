package homework_5.garik_gharibyan.pizza;

public class main {
    public static void main(String[] args) {

        Order order1 = Order.makeOrder(
                new Pizza("Margarita",PizzaType.regular),
                2,
                new Customer("Jon", 7717));
        order1.getInfo();
        order1.addIngredient(Ingredient.tomato_paste);
        order1.addIngredient(Ingredient.peperoni);
        order1.addIngredient(Ingredient.garlic);
        order1.addIngredient(Ingredient.bacon);

        Order order2 = Order.makeOrder(
                new Pizza("Europa", PizzaType.regular),
                5,
                new Customer("Garik", 4540));
        order2.getInfo();
        order2.addIngredient(Ingredient.tomato_paste);
        order2.addIngredient(Ingredient.cheese);
        order2.addIngredient(Ingredient.salami);
        order2.addIngredient(Ingredient.olives);
    }
}
