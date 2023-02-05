package homework_5.Hovhannes_Gspeyan.pizzeriaPalmetto;

/**
 * this class tests pizzeria Palmetto
 * works as needed or not
 */
public class PizzeriaPalmettoDemo {

    public static void main(String[] args) {
        Order order1 = new Order(new Customer("John", 7717));
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

        Order order2 = new Order(new Customer("George", 4372));
        Pizza basePZZ = new Pizza("BasePZZ", "", 12);
        basePZZ.addIngredient("Bacon");
        basePZZ.addIngredient("Cheese");
        basePZZ.addIngredient("Garlic");
        basePZZ.addIngredient("Corn");

        Order order3 = new Order(new Customer("Juan", 4545));
        Pizza baseWithCalzoneAndTomatoPaste = new Pizza("BaseWithCalzoneAndTomatoPaste", "Calzone", 1, order3.getIndex(), order3.getCustomer());
        baseWithCalzoneAndTomatoPaste.addIngredient("Bacon");
        baseWithCalzoneAndTomatoPaste.addIngredient("Garlic");
        baseWithCalzoneAndTomatoPaste.addIngredient("Corn");
        baseWithCalzoneAndTomatoPaste.addIngredient("Cheese");
        baseWithCalzoneAndTomatoPaste.addIngredient("Pepperoni");

        order1.displayPizzaAttributes(margarita);
        order1.displayPizzaAttributes(pepperoniOro);
        order2.displayPizzaAttributes(basePZZ);
        order3.displayPizzaAttributes(baseWithCalzoneAndTomatoPaste);

        order1.addPizza(pepperoniOro);
        order1.addPizza(margarita);

//         order1.addPizza(pepperoniOro);
//         order1.addPizza(pepperoniOro);
//         order1.addPizza(pepperoniOro);
//         order1.addPizza(pepperoniOro);
//         order1.addPizza(pepperoniOro);
//         order1.addPizza(pepperoniOro);
//         order1.addPizza(pepperoniOro);
//         order1.addPizza(pepperoniOro);
//         order1.addPizza(pepperoniOro);

        order1.printCheck();

        order2.addPizza(basePZZ);
        order2.printCheck();

        order3.addPizza(baseWithCalzoneAndTomatoPaste);
        order3.printCheck();
    }
}
