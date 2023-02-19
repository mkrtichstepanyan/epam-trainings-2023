package homework_7.garik_gharibyan.fast_foot;

import homework_7.garik_gharibyan.fast_foot.foots.Food;
import homework_7.garik_gharibyan.fast_foot.foots.drink.Drink;
import homework_7.garik_gharibyan.fast_foot.foots.drink.DrinkType;
import homework_7.garik_gharibyan.fast_foot.foots.pizza.Ingredient;
import homework_7.garik_gharibyan.fast_foot.foots.pizza.Pizza;
import homework_7.garik_gharibyan.fast_foot.foots.pizza.PizzaType;

public class FastFood {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Customer customer = new Customer("Jon", 7717);
        Food[] foods = new Food[4];

        Pizza pizzaMargarita = new Pizza("Margarita", 2, PizzaType.closed);
        pizzaMargarita.addIngredient(Ingredient.tomato_paste);
        pizzaMargarita.addIngredient(Ingredient.peperoni);
        pizzaMargarita.addIngredient(Ingredient.garlic);
        pizzaMargarita.addIngredient(Ingredient.bacon);

        Pizza pizzaEuropa = new Pizza("Europa", 3, PizzaType.regular);
        pizzaEuropa.addIngredient(Ingredient.tomato_paste);
        pizzaEuropa.addIngredient(Ingredient.cheese);
        pizzaEuropa.addIngredient(Ingredient.salami);
        pizzaEuropa.addIngredient(Ingredient.olives);

        Drink drinkCocaCola = new Drink(DrinkType.COCA_COLA, 5);
        Drink drinkPepsi = new Drink(DrinkType.PEPSI, 3);

        foods[0] = pizzaMargarita;
        foods[1] = pizzaEuropa;
        foods[2] = drinkCocaCola;
        foods[3] = drinkPepsi;

        Order orderForJon = Order.makeOrder(foods, customer);

        printer.printOrderAttributes(orderForJon);
        printer.printTotalAmountByOrder(orderForJon);
        printer.printCheck(orderForJon);


        Customer customerJack = new Customer("Jack", 7717);
        Food[] foodsForJack = new Food[4];

        Pizza pizzaItaliano = new Pizza("Margarita", 2, PizzaType.closed);
        pizzaItaliano.addIngredient(Ingredient.tomato_paste);
        pizzaItaliano.addIngredient(Ingredient.peperoni);
        pizzaItaliano.addIngredient(Ingredient.garlic);
        pizzaItaliano.addIngredient(Ingredient.bacon);

        Drink drinkFantaForJack = new Drink(DrinkType.FANTA, 5);
        Drink drinkPepsiForJack = new Drink(DrinkType.PEPSI, 3);
        Drink drinkCocaColaForJack = new Drink(DrinkType.COCA_COLA, 10);

        foodsForJack[0] = pizzaItaliano;
        foodsForJack[1] = drinkFantaForJack;
        foodsForJack[2] = drinkPepsiForJack;
        foodsForJack[3] = drinkCocaColaForJack;

        Order orderForJack = Order.makeOrder(foodsForJack, customerJack);

        printer.printOrderAttributes(orderForJack);
        printer.printTotalAmountByOrder(orderForJack);
        printer.printCheck(orderForJack);

    }
}
