package homework_5.Araksya_Ghazaryan.Palmetto;
public class PizzaTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Ann");
        Order order = new Order(customer);
        Pizza margar = new Pizza("Margarita", PizzaType.closed, 1, customer);
        margar.addIngredient("Tomato paste");
        margar.addIngredient("Cheese");
        margar.addIngredient("Olives");
        margar.addIngredient("Bacon");
        order.addPizza(margar);
        order.printCheck();
        order.PizzaAttributes();

        Customer customer1 = new Customer("Jeck");
        Order order1 = new Order(customer1);
        Pizza margarita = new Pizza("Margarita", PizzaType.closed, 3, customer1);
        margarita.addIngredient("Tomato paste");
        margarita.addIngredient("Pepperoni");
        margarita.addIngredient("Garlic");
        margarita.addIngredient("Bacon");
        order1.addPizza(margarita);

        Pizza pepperoniOro = new Pizza("PepperoniOro", PizzaType.regular, 4, customer1);
        pepperoniOro.addIngredient("Chees");
        pepperoniOro.addIngredient("Corn");
        pepperoniOro.addIngredient("Pepperoni");
        pepperoniOro.addIngredient("Olives");
        order1.addPizza(pepperoniOro);
        order1.printCheck();
        order1.PizzaAttributes();
    }
}