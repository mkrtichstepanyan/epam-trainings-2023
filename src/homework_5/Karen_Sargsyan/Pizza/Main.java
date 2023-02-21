package homework_5.Karen_Sargsyan.Pizza;

public class Main {
    public static void main(String[] args) {
            Customer customer = new Customer("Karen");

            Pizza pizza1 = new Pizza ("Margarita", PizzaType.getTypeOfPizzaClosed(), 3);

            pizza1.addIngredient(Ingredient.getBacon());
            pizza1.addIngredient(Ingredient.getTomatoPaste());
            pizza1.addIngredient(Ingredient.getCheese());

            Pizza pizza2 = new Pizza("Pepperoni", PizzaType.getTypeOfPizzaRegular(), 2);

            pizza2.addIngredient(Ingredient.getTomatoPaste());
            pizza2.addIngredient(Ingredient.getPepperoni());
            pizza2.addIngredient(Ingredient.getCheese());

            Order order = new Order(customer);
            order.addPizza(pizza1);
            order.addPizza(pizza2);

            CheckPrinter.printCheck(order);

    }

}
