package homework_5.Nona_Asatryan.pizzeria_palmetto;

public class PizzaOrderTest {
    public static void main(String[] args) {
        Order order = new Order(new Customer("Jack", 7717));
        Pizza margarita = new Pizza("Margarita", PizzaType.CLOSED, 2);
        margarita.addIngredient("Tomato paste");
        margarita.addIngredient("Pepperoni");
        margarita.addIngredient("Garlic");
        margarita.addIngredient("Bacon");

        Pizza pepperoniOro = new Pizza("PepperoniOro", PizzaType.CLOSED, 3);
        pepperoniOro.addIngredient("Tomato paste");
        pepperoniOro.addIngredient("Cheese");
        pepperoniOro.addIngredient("Salami");
        pepperoniOro.addIngredient("Olives");

        order.addPizza(margarita);
        order.addPizza(pepperoniOro);
        order.printCheck();
        order.displayPizzaAttributes(margarita);
        order.displayPizzaAttributes(pepperoniOro);

        Order order1 = new Order(new Customer("Elen", 4372));
        Pizza basePZZ = new Pizza("BasePZZ", PizzaType.REGULAR, 9);
        basePZZ.addIngredient("Cheese");
        basePZZ.addIngredient("Garlic");
        basePZZ.addIngredient("Corn");
        basePZZ.addIngredient("Olives");

        order1.addPizza(basePZZ);
        order1.printCheck();
        order1.displayPizzaAttributes(basePZZ);
    }
}
