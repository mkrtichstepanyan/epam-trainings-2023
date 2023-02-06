package homework_5.Karen_Mikayelyan;

public class PizzaOrderDemo {
    public static void main(String[] args) {
        Customer customer = new Customer("Karen", 5555);
        Order order = new Order(customer);
        Pizza margarita = new Pizza("Margarita", "Calzone", 5, 2, customer);
        margarita.addIngredient("Tomato paste");
        margarita.addIngredient("Pepperoni");
        margarita.addIngredient("Garlic");
        margarita.addIngredient("Bacon");
        order.addPizza(margarita);
        order.printCheck();

        Pizza pepperoniOro = new Pizza("PepperoniOro", "Calzone", 3, 1, customer);
        pepperoniOro.addIngredient("Tomato paste");
        pepperoniOro.addIngredient("Cheese");
        pepperoniOro.addIngredient("Salami");
        pepperoniOro.addIngredient("Olives");

        Customer customer1 = new Customer("Jack", 1568);
        Order order1 = new Order(customer1);
        Pizza basePizza = new Pizza("BasePzz", "Calzone", 8, 3, customer1);
        basePizza.addIngredient("Bacon");
        basePizza.addIngredient("Cheese");
        basePizza.addIngredient("Corn");
        basePizza.addIngredient("Garlic");
        order1.addPizza(margarita);
        order1.addPizza(pepperoniOro);

    }

}
