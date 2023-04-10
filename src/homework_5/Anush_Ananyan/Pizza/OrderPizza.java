package homework_5.Anush_Ananyan.Pizza;

public class OrderPizza {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Anush");

        Pizza pizza1 = new Pizza("Margarita", PizzaType.getRegular(), 2);
        Pizza pizza2 = new Pizza("BasePZZ", PizzaType.getCalzone(), 12);
        Pizza pizza3 = new Pizza("PeperoniOro", PizzaType.getRegular(), 3);
        Pizza[] pizzas = new Pizza[3];
        pizzas[0] = pizza1;
        pizzas[1] = pizza2;
        pizzas[2] = pizza3;

        Order order1 = new Order(customer1, pizzas);
        order1.displayingPizzaAttributes(pizzas);

        Ingredients[] ingredients = new Ingredients[5];
        ingredients[0] = Ingredients.getTomatoPaste();
        ingredients[1] = Ingredients.getPaper();
        ingredients[2] = Ingredients.getGarlic();
        ingredients[3] = Ingredients.getBacon();
        order1.getPizzas()[0].addIngredients(ingredients);

        Ingredients[] ingredients2 = new Ingredients[5];
        ingredients2[0] = Ingredients.getTomatoPaste();
        ingredients2[1] = Ingredients.getCheese();
        ingredients2[2] = Ingredients.getSalami();
        ingredients2[3] = Ingredients.getOlives();
        order1.getPizzas()[1].addIngredients(ingredients2);

        Ingredients[] ingredients3 = new Ingredients[4];
        ingredients3[0] = Ingredients.getTomatoPaste();
        ingredients3[1] = Ingredients.getCheese();
        ingredients3[2] = Ingredients.getPepperoni();
        ingredients3[3] = Ingredients.getOlives();
        order1.getPizzas()[2].addIngredients(ingredients3);

        order1.checkQuantity(pizzas);


        Print check = new Print();
        check.printCheck(order1);

    }

}
