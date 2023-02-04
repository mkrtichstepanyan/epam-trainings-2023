package homework_5.Robert_Nazaryan.pizza;

public class Main {

    public static void main(String[] args) {
        Pizza pizzaMargarita = new Pizza();
        pizzaMargarita.addIngredient("Tomato");
        pizzaMargarita.addIngredient("Olives");
        pizzaMargarita.addIngredient("Garlic");
        pizzaMargarita.addIngredient("Baacon");
        Pizza[] pizzasMargarita = new Pizza[]{pizzaMargarita};
        Order orderMargarita = new Order(new Customer("Margarita"),pizzasMargarita, "closed" );
        orderMargarita.orderInfo();
        orderMargarita.printCheck();

        Pizza pizzaPepperoniOro = new Pizza();
        pizzaPepperoniOro.addIngredient("Tomato");
        pizzaPepperoniOro.addIngredient("Pepperoni");
        pizzaPepperoniOro.addIngredient("Garlic");
        pizzaPepperoniOro.addIngredient("Cheese");
        Pizza[] pizzasPepperoniOro = new Pizza[]{pizzaPepperoniOro};
        Order orderPepperoniOro = new Order(new Customer("pizzaPepperoniOro"),pizzasPepperoniOro, "closed" );
        orderPepperoniOro.orderInfo();
        orderPepperoniOro.printCheck();
    }

}
