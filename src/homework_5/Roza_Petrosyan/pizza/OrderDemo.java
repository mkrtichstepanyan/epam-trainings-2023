package homework_5.Roza_Petrosyan.pizza;
public class OrderDemo {
    public static void main(String[] args) {
        // Part 1
        System.out.println("---------------Part 1---------------------");

        Pizza firstPizza = new Pizza("Margarita", PizzaType.CALZONE, 2);

        Pizza secondPizza = new Pizza("PepperoniOro", PizzaType.CALZONE, 3);

        Pizza thirdPizza = new Pizza("Salami", PizzaType.REGULAR, 1);

        Customer customer1 = new Customer("Roza");

        Pizza[] pizzas = new Pizza[3];
        pizzas[0] = firstPizza;
        pizzas[1] = secondPizza;
        pizzas[2] = thirdPizza;

        Order order = new Order(customer1, pizzas);

        order.displayPizzaAttributes(pizzas);


        // Part 2
        System.out.println("---------------Part 2---------------------");
        Ingredient[] ingredients1 = new Ingredient[20];
        ingredients1[0] = Ingredient.TOMATO_PASTE;
        ingredients1[1] = Ingredient.GARLIC;
        ingredients1[2] = Ingredient.PEPPER;
        ingredients1[6] = Ingredient.BACON;
        order.getPizzas()[0].addIngredient(ingredients1);

        Ingredient[] ingredients2 = new Ingredient[4];
        ingredients2[0] = Ingredient.TOMATO_PASTE;
        ingredients2[1] = Ingredient.CHEESE;
        ingredients2[2] = Ingredient.PEPPERONI;
        ingredients2[3] = Ingredient.OLIVES;
        order.getPizzas()[1].addIngredient(ingredients2);

        Ingredient[] ingredients3 = new Ingredient[4];
        ingredients3[0] = Ingredient.TOMATO_PASTE;
        ingredients3[1] = Ingredient.CHEESE;
        ingredients3[2] = Ingredient.SALAMI;
        ingredients3[3] = Ingredient.OLIVES;
        order.getPizzas()[2].addIngredient(ingredients3);

        // Part 3
        System.out.println("---------------Part 3---------------------");


        Print checkPrint = new Print();
        checkPrint.printCheck(order);

        // Part 4
        System.out.println("---------------Part 4---------------------");
        // This part already I have done in first part
        // Customer number 7717 wants to order 2 pcs. "Margarita" and 3 pcs. the usual "PepperoniOro".


        // Customer with number 4372 wants to order delivery of 12 pcs. usual pizzas "BasePZZ".
        Pizza pizza = new Pizza("BasePZZ", PizzaType.REGULAR, 12);

        Customer customer2 = new Customer("Roza_Petrosyan");

        Pizza[] pizzas1 = new Pizza[1];
        pizzas1[0] = pizza;

        Order order2 = new Order(customer2, pizzas1);

        order2.displayPizzaAttributes(pizzas1);

        System.out.println("---------------Part 5---------------------");
        System.out.println("Order Local Time is: " + order.getOrderTime());


    }
}
