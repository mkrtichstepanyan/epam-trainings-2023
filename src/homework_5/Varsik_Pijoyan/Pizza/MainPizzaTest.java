package homework_5.Varsik_Pijoyan.Pizza;

public class MainPizzaTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Karen");
        Order order = new Order(customer);
        Pizza margarita = new Pizza("Margarita", "Calzone", 2, customer);
        Pizza margarita2 = new Pizza("Margarita", "Calzone", 9, customer);
        margarita.addIngredient("Tomato paste");
        margarita.addIngredient("Pepperoni");
        margarita.addIngredient("Garlic");
        margarita.addIngredient("Bacon");
        order.addPizza(margarita);
        order.addPizza(margarita2);

        Pizza pepperoniOro = new Pizza("PepperoniOro", "Calzone", 3, customer);
        pepperoniOro.addIngredient("Tomato paste");
        pepperoniOro.addIngredient("Cheese");
        pepperoniOro.addIngredient("Salami");
        pepperoniOro.addIngredient("Olives");
        order.addPizza(pepperoniOro);
        order.printCheck();
        order.displayPizzaAttributes(margarita);

        Customer customer1 = new Customer("Jack");
        Order order1 = new Order(customer1);
        Pizza basePZZ = new Pizza("BasePzz", "Calzone", 3, customer1);
        basePZZ.addIngredient("Bacon");
        basePZZ.addIngredient("Cheese");
        basePZZ.addIngredient("Corn");
        basePZZ.addIngredient("Garlic");
        order1.addPizza(basePZZ);
        order1.printCheck();
        order1.displayPizzaAttributes(basePZZ);
    }

}
