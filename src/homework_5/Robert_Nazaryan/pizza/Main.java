package homework_5.Robert_Nazaryan.pizza;

public class Main {

    public static void main(String[] args) {

        Order orderMargarita = new Order("Margarita", "closed", 1);
        Order orderPepperoniOro = new Order("PepperoniOro", "regular", 3);

        orderPepperoniOro.orderInfo();
        orderMargarita.orderInfo();

        orderMargarita.addIngredient("tomato");
        orderMargarita.addIngredient("pepperoni");
        orderMargarita.addIngredient("garlic");
        orderMargarita.addIngredient("bacon");

        orderPepperoniOro.addIngredient("Tomato");
        orderPepperoniOro.addIngredient("Cheese");
        orderPepperoniOro.addIngredient("Salami");
        orderPepperoniOro.addIngredient("Olives");

        orderMargarita.printCheck();
        orderPepperoniOro.printCheck();
    }
}
