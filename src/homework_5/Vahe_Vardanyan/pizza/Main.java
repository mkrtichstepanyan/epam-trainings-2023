package homework_5.Vahe_Vardanyan.pizza;

public class Main {
    public static void main(String[] args) {
        Costomer costomer = new Costomer("John");
        Order order = new Order(costomer);
        Pizza margarita = new Pizza("Margarita", PizzaType.CLOSED, 1, costomer);
        margarita.addIngredient("Tomato Paste");
        margarita.addIngredient("Pepperoni");
        margarita.addIngredient("Garlic");
        margarita.addIngredient("Bacon");
        order.addPizza(margarita);
        order.printCheck();
        order.displayPizzaAttributes();

        Costomer costomer1 = new Costomer("Teddy");
        Order order1 = new Order(costomer1);
        margarita = new Pizza("Margarita", PizzaType.CLOSED, 5, costomer1);
        margarita.addIngredient("Tomato paste");
        margarita.addIngredient("Pepperoni");
        margarita.addIngredient("Garlic");
        margarita.addIngredient("Bacon");
        order1.addPizza(margarita);
        Pizza pepperoni0ro = new Pizza("Pepperoni0ro", PizzaType.CLOSED,5, costomer1);
        pepperoni0ro.addIngredient("Garlic");
        pepperoni0ro.addIngredient("Corn");
        pepperoni0ro.addIngredient("Pepperoni");
        pepperoni0ro.addIngredient("Olives");
        order1.addPizza(pepperoni0ro);
        Pizza pepper = new Pizza("adf", PizzaType.CLOSED,1,costomer1);
        pepper.addIngredient("Cheese");
        pepper.addIngredient("Olives");
        pepper.addIngredient("Corn");
        pepper.addIngredient("Corn");
        order1.addPizza(pepper);
        order1.printCheck();

        order1.displayPizzaAttributes();




    }
    
    
}
