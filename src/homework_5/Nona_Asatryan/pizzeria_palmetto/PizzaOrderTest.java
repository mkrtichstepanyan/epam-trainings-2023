package homework_5.Nona_Asatryan.pizzeria_palmetto;

public class PizzaOrderTest {
    public static void main(String[] args) {
        Order order = new Order(new Customer("Jack"));
        Pizza margarita = new Pizza("Margarita", PizzaType.CLOSED, 2, order.getCustomer());
        margarita.addIngredient(Ingredient.TOMATO_PASTE);
        margarita.addIngredient(Ingredient.PEPERONI);
        margarita.addIngredient(Ingredient.GARLIC);
        margarita.addIngredient(Ingredient.BACON);

        Pizza pepperoniOro = new Pizza("PepperoniOro", PizzaType.CLOSED, 3, order.getCustomer());
        pepperoniOro.addIngredient(Ingredient.TOMATO_PASTE);
        pepperoniOro.addIngredient(Ingredient.CHEESE);
        pepperoniOro.addIngredient(Ingredient.SALAMI);
        pepperoniOro.addIngredient(Ingredient.OLIVES);

        order.addPizza(margarita);
        order.addPizza(pepperoniOro);
        order.printCheck();
        order.displayPizzaAttributes(margarita);
        order.displayPizzaAttributes(pepperoniOro);


        Order order1 = new Order(new Customer("Elen"));
        Pizza basePZZ = new Pizza("BasePZZ", PizzaType.REGULAR, 9, order1.getCustomer());
        basePZZ.addIngredient(Ingredient.CHEESE);
        basePZZ.addIngredient(Ingredient.GARLIC);
        basePZZ.addIngredient(Ingredient.CORN);
        basePZZ.addIngredient(Ingredient.OLIVES);

        order1.addPizza(basePZZ);
        order1.printCheck();
        order1.displayPizzaAttributes(basePZZ);
    }
}
