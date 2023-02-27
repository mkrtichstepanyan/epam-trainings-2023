package homework_9.assignment.Ani_Kovalenko.Pizza_Enum_Interface;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer("Sevak", "+37498000000");
        Order order = new Order(customer);

        IngredientPizza[] ingredients1 = {IngredientPizza.GARLIC, IngredientPizza.CORN, IngredientPizza.TOMATO_PASTE,
                IngredientPizza.BACON, IngredientPizza.CHEESE, IngredientPizza.OLIVES, IngredientPizza.SALAMI};
        Item pizza = new Pizza("Margarita", PizzaType.REGULAR, ingredients1, 3);
        order.addItem(pizza);

        IngredientBurger[] ingredients2 = {IngredientBurger.CHEESE, IngredientBurger.CHICKEN_MEAT};
        Item burger = new Burger("B", BurgerBreadType.BLACK_BREAD, ingredients2, 2);
        order.addItem(burger);

        Printer.printCheck(order);
    }
}
