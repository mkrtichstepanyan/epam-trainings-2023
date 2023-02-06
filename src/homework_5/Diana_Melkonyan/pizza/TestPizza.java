package homework_5.Diana_Melkonyan.pizza;

public class TestPizza {
    public static void main(String[] args) {
        Order order1 = new Order(new Customer("Vika", 7717));
        Pizza margarita = new Pizza("Margarita", "Calzone", 3);
        margarita.addIngredient("Tomato paste ");
        margarita.addIngredient("Garlic ");
        margarita.addIngredient("Pepperoni ");
        margarita.addIngredient(" Bacon ");


        Order order2 = new Order(new Customer("Alex", 7717));
        Pizza pepperoniOro = new Pizza("PepperoniOro", "Calzone", 2);
        pepperoniOro.addIngredient("Tomato paste");
        pepperoniOro.addIngredient("Cheese");
        pepperoniOro.addIngredient("Salami");
        pepperoniOro.addIngredient("Olives");


        Order order3 = new Order(new Customer("Max", 4372));
        Pizza basePZZ = new Pizza("BasePZZ", "Calzone", 12);
        basePZZ.addIngredient("Salami");
        basePZZ.addIngredient("Bacon");
        basePZZ.addIngredient("Corn");
        basePZZ.addIngredient("Olives");

        order1.showPizzaAtributes((margarita));
        order2.showPizzaAtributes(pepperoniOro);
        order3.showPizzaAtributes(basePZZ);

        order1.addPizza(margarita);
        order1.printCheck();
        order2.addPizza(pepperoniOro);
        order2.printCheck();
        order3.addPizza(basePZZ);
        order3.printCheck();


    }
}
