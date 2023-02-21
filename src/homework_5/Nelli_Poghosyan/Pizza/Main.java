package homework_5.Nelli_Poghosyan.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Margarite", PizzaType.getClosed(), 2, 4);
        Ingredients ing1 = new Ingredients();
        ing1.setIngredientName("Tomato paste");
        Ingredients ing2 = new Ingredients();
        ing2.setIngredientName("Pepperoni");
        Ingredients ing3 = new Ingredients();
        ing3.setIngredientName("Garlic");
        Ingredients ing4 = new Ingredients();
        ing4.setIngredientName("Bacon");
        pizza.addIngredient(ing1);
        pizza.addIngredient(ing2);
        pizza.addIngredient(ing3);
        pizza.addIngredient(ing4);

        Pizza pizza1 = new Pizza("PepperoniOro", PizzaType.getRegular(), 3, 4);
        Ingredients ing11 = new Ingredients();
        ing11.setIngredientName("Tomato paste");
        Ingredients ing12 = new Ingredients();
        ing12.setIngredientName("Cheese");
        Ingredients ing13 = new Ingredients();
        ing13.setIngredientName("Salami");
        Ingredients ing14 = new Ingredients();
        ing14.setIngredientName("Olives");
        pizza1.addIngredient(ing11);
        pizza1.addIngredient(ing12);
        pizza1.addIngredient(ing13);
        pizza1.addIngredient(ing14);

        PizzaList pizzalist = new PizzaList(2);
        pizzalist.addPizza(pizza);
        pizzalist.addPizza(pizza1);
        Order order1 = new Order(7717);
        order1.printCheck(pizzalist);

        Pizza pizza3 = new Pizza("BasePZZ", PizzaType.getRegular(), 12);
        PizzaList pizzaList1 = new PizzaList(1);
        pizzaList1.addPizza(pizza3);
        Order order2 = new Order(4372);
        order2.printCheck(pizzaList1);
    }
}
