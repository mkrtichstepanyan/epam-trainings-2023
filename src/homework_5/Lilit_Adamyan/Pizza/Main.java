package homework_5.Lilit_Adamyan.Pizza;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Margarita");

        Pizza margarita = new Pizza("Margarita", "Pizza Base (Calzone)", 2);
        margarita.addIngredients("Tomato paste");
        margarita.addIngredients("Pepper");
        margarita.addIngredients("Garlic");
        margarita.addIngredients("Bacon");

        Pizza anotherPizza = new Pizza("Pepperoni", "regular", 3);
        anotherPizza.addIngredients("Tomato paste");
        anotherPizza.addIngredients("Cheese");
        anotherPizza.addIngredients("Salami");
        anotherPizza.addIngredients("Olives");

        Order order1 = new Order(customer1);
        order1.addPizza(margarita);
        order1.addPizza(anotherPizza);
        order1.displayPizzaAttributes();
        order1.printCheck();

        Customer customer2 = new Customer("BasePZZ");
        Order order2 = new Order(customer2);
        Pizza basPzz = new Pizza("BasePzz", "regular", 12);
        basPzz.addIngredients("Tomato paste");
        basPzz.addIngredients("Cheese");

        order2.addPizza(basPzz);
        order2.displayPizzaAttributes();
        order2.printCheck();


    }


}

