package homework_5.Diana_Melkonyan.pizza;

public class TestPizza {
    public static void main(String[] args) {

        Customer customer = new Customer("Vika", 3345);
        Order order1 = new Order(customer);
        Pizza margarita = new Pizza("Margarita", "Calzone", 2,customer);
        margarita.addIngredient("Tomato paste");
        margarita.addIngredient("Garlic");
        margarita.addIngredient("Pepperoni");
        margarita.addIngredient(" Bacon");

        Pizza pepperoniOro = new Pizza("PepperoniOro", "Calzone", 3,customer);
        pepperoniOro.addIngredient("Tomato paste");
        pepperoniOro.addIngredient("Cheese");
        pepperoniOro.addIngredient("Salami");
        pepperoniOro.addIngredient("Olives");

        Customer customer2 = new Customer("Max", 3345);
        Order order2 = new Order(customer);
        Pizza basePZZ = new Pizza("BasePZZ", "Calzone", 12,customer2);
        basePZZ.addIngredient("Salami");
        basePZZ.addIngredient("Bacon");
        basePZZ.addIngredient("Corn");
        basePZZ.addIngredient("Olives");



        order1.showPizzaAtributes((margarita));
        order1.showPizzaAtributes(pepperoniOro);
        order2.showPizzaAtributes(basePZZ);

        order1.addPizza(margarita);
        order1.addPizza(pepperoniOro);
        order1.printCheck();

        order2.addPizza(basePZZ);
        order2.printCheck();

    }
}
