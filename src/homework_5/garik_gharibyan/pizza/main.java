package homework_5.garik_gharibyan.pizza;

public class main {
    public static void main(String[] args) {

        Customer customer = new Customer("Jon", 7717);
        Pizza[] pizzas = new Pizza[2];

        pizzas[0] = new Pizza("Margarita", 2, PizzaType.closed);
        pizzas[0].addIngredient(Ingredient.tomato_paste);
        pizzas[0].addIngredient(Ingredient.peperoni);
        pizzas[0].addIngredient(Ingredient.garlic);
        pizzas[0].addIngredient(Ingredient.bacon);

        pizzas[1] = new Pizza("Europa", 3, PizzaType.regular);
        pizzas[1].addIngredient(Ingredient.tomato_paste);
        pizzas[1].addIngredient(Ingredient.cheese);
        pizzas[1].addIngredient(Ingredient.salami);
        pizzas[1].addIngredient(Ingredient.olives);

        Order order = Order.makeOrder(pizzas, customer);

        order.pizzaAttributes();
        order.printCheck();

//        Part 3
        System.out.println("\n\n Part 3");

        Customer customer7717 = new Customer("Jack", 7717);

        Pizza[] pizzasForCustomer7717 = new Pizza[2];
        pizzasForCustomer7717[0] = new Pizza("Margarita", 3, PizzaType.closed);
        pizzasForCustomer7717[0].addIngredient(Ingredient.tomato_paste);
        pizzasForCustomer7717[0].addIngredient(Ingredient.cheese);
        pizzasForCustomer7717[0].addIngredient(Ingredient.salami);
        pizzasForCustomer7717[0].addIngredient(Ingredient.olives);
        pizzasForCustomer7717[1] = new Pizza("PeperoniOro",1, PizzaType.regular);
        pizzasForCustomer7717[1].addIngredient(Ingredient.tomato_paste);
        pizzasForCustomer7717[1].addIngredient(Ingredient.cheese);
        pizzasForCustomer7717[1].addIngredient(Ingredient.salami);
        pizzasForCustomer7717[1].addIngredient(Ingredient.olives);

        Order orderForCustomer7717 = Order.makeOrder(pizzasForCustomer7717, customer7717);
        orderForCustomer7717.printCheck();


        Customer customer4372 = new Customer("Jack", 4372);

        Pizza[] pizzasForCustomer4372 = new Pizza[1];
        pizzasForCustomer4372[0] = new Pizza("BasePZZ",12,PizzaType.regular);

        Order orderCustomer4372 = Order.makeOrder(pizzasForCustomer4372,customer4372);
        orderCustomer4372.printCheck();

    }
}
