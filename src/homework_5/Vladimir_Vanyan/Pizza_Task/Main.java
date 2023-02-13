package homework_5.Vladimir_Vanyan.Pizza_Task;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Lisa");
        Order order = new Order(customer);
        Pizza margarita = new Pizza("Margarita", "Calzone", 5, customer);
        Pizza margarita2 = new Pizza("Margarita", "Calzone", 9, customer);
        margarita.addIngredient("Tomato paste");
        margarita.addIngredient("Garlic");
        margarita.addIngredient("Bacon");
        margarita.addIngredient("Cheese");

        order.addPizza(margarita);
        order.addPizza(margarita2);
        order.printCheck();

        Pizza pepperoniOro = new Pizza("PepperoniOro", "Calzone", 3, customer);
        pepperoniOro.addIngredient("Cheese");
        pepperoniOro.addIngredient("Salami");
        pepperoniOro.addIngredient("Olives");
        order.addPizza(pepperoniOro);
        order.printCheck();
        order.displayPizzaAttributes(margarita);

    }
}
