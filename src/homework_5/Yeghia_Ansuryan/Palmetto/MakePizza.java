package homework_5.Yeghia_Ansuryan.Palmetto;

public class MakePizza {
    public static void main(String[] args) {

        Customer customer = new Customer("Lena");

        Pizza pizza1 = new Pizza("Buffalo", PizzaType.getRegular(), 2);

        pizza1.addIngredient(Ingredient.salami());
        pizza1.addIngredient(Ingredient.bacon());
        pizza1.addIngredient(Ingredient.cheese());
        pizza1.addIngredient(Ingredient.corn());
        pizza1.addIngredient(Ingredient.garlic());

        Pizza pizza2 = new Pizza("Hawaiian", PizzaType.getCalzone(), 4);

        pizza2.addIngredient(Ingredient.olives());
        pizza2.addIngredient(Ingredient.garlic());
        pizza2.addIngredient(Ingredient.corn());
        pizza2.addIngredient(Ingredient.tomatoPaste());

        Order order = new Order(customer);
        order.addPizza(pizza1);
        order.addPizza(pizza2);

        CheckPrinter.printCheck(order);

    }
}
