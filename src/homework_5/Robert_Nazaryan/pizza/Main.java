package homework_5.Robert_Nazaryan.pizza;

public class Main {

    public static void main(String[] args) {
        Pizza pizzaMargarita = new Pizza();
        pizzaMargarita.addIngredient("Tomato");
        pizzaMargarita.addIngredient("Pepperoni");
        pizzaMargarita.addIngredient("Garlic");
        pizzaMargarita.addIngredient("Cheese");
        Pizza[] pizzas = new Pizza[]{pizzaMargarita};
        Order orderMargarita = new Order(new Customer("Margarita"),pizzas, "closed" );
        orderMargarita.orderInfo();
        orderMargarita.printCheck();
    }
}
