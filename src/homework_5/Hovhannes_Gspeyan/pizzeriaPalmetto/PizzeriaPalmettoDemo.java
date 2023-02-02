package homework_5.Hovhannes_Gspeyan.pizzeriaPalmetto;

/**
 * this class tests pizzeria Palmetto
 * works as needed or not
 */
public class PizzeriaPalmettoDemo {

    public static void main(String[] args) {
        Order order1 = new Order( 7717, 2);
        Pizza margarita = new Pizza("Margarita", "Calzone", 2);
        margarita.addIngredient("Tomato paste");
        margarita.addIngredient("Pepperoni");
        margarita.addIngredient("Garlic");
        margarita.addIngredient("Bacon");

        Pizza pepperoniOro = new Pizza("PepperoniOro", "Calzone", 3);
        pepperoniOro.addIngredient("Tomato paste");
        pepperoniOro.addIngredient("Cheese");
        pepperoniOro.addIngredient("Salami");
        pepperoniOro.addIngredient("Olives");

        Order order2 = new Order( 4372, 1);
        Pizza basePZZ = new Pizza("BasePZZ", "", 12);
        basePZZ.addIngredient("Bacon");
        basePZZ.addIngredient("Cheese");
        basePZZ.addIngredient("Garlic");
        basePZZ.addIngredient("Corn");

        order1.displayPizzaAttributes(margarita);
        order1.displayPizzaAttributes(pepperoniOro);
        order2.displayPizzaAttributes(basePZZ);

        order1.addPizza(margarita, 0);
        order1.addPizza(pepperoniOro, 1);
        order1.printCheck();

        order2.addPizza(basePZZ, 0);
        order2.printCheck();
    }
}
