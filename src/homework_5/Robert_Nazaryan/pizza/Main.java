package homework_5.Robert_Nazaryan.pizza;

public class Main {

    public static void main(String[] args) {
        Pizza pizzaMargarita = new Pizza();
        pizzaMargarita.addIngredient("Tomato");
        pizzaMargarita.addIngredient("Olives");
        pizzaMargarita.addIngredient("Garlic");
        pizzaMargarita.addIngredient("Bacon");
        pizzaMargarita.setPizzaType("closed");


        Pizza pizzaMargaritaRegular = new Pizza();
        pizzaMargaritaRegular.addIngredient("Olives");
        pizzaMargaritaRegular.addIngredient("Salami");
        pizzaMargaritaRegular.addIngredient("Garlic");
        pizzaMargaritaRegular.addIngredient("Corn");
        pizzaMargaritaRegular.setPizzaType("regular");

        Pizza[] pizzasMargarita = new Pizza[]{pizzaMargarita, pizzaMargaritaRegular};
        Order orderMargarita = new Order(new Customer("Margarita"), pizzasMargarita);
        orderMargarita.orderInfo();
        orderMargarita.printCheck();

        Pizza pizzaPepperoniOro = new Pizza();
        pizzaPepperoniOro.addIngredient("Tomato");
        pizzaPepperoniOro.addIngredient("Pepperoni");
        pizzaPepperoniOro.addIngredient("Garlic");
        pizzaPepperoniOro.addIngredient("Cheese");
        pizzaPepperoniOro.setPizzaType("closed");
        Pizza[] pizzasPepperoniOro = new Pizza[]{pizzaPepperoniOro};
        Order orderPepperoniOro = new Order(new Customer("pizzaPepperoniOro"), pizzasPepperoniOro);
        orderPepperoniOro.orderInfo();
        orderPepperoniOro.printCheck();
    }
}
