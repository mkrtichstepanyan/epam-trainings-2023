package homework_5.aram_mehrabyan.Pizzeria;

public class OrderTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jeff");
        Order order1 = new Order(customer);
        Pizza margarita = new Pizza("Margarita", "Calzone", 1, customer);
        margarita.addIngredients("Tomato paste");
        margarita.addIngredients("Pepperoni");
        margarita.addIngredients("Garlic");
        margarita.addIngredients("Bacon");
        order1.addPizza(margarita);
        order1.printCheck();
        order1.display();

        Customer customer1 = new Customer("Jhon");
        Order order2 = new Order(customer);
        Pizza zvezda = new Pizza("Zvezda", " ", 3, customer1);
        zvezda.addIngredients("Tomato paste");
        zvezda.addIngredients("Cheese");
        zvezda.addIngredients("Corn");
        zvezda.addIngredients("Olives");
        order2.addPizza(zvezda);
        order2.printCheck();
        order2.display();


    }
}
