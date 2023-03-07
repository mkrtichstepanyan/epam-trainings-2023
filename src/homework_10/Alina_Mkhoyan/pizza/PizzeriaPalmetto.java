package homework_10.Alina_Mkhoyan.pizza;

import homework_10.Alina_Mkhoyan.pizza.exception.InvalidPriceException;
import homework_10.Alina_Mkhoyan.pizza.exception.OrderException;

public class PizzeriaPalmetto {

    public static void main(String[] args) throws OrderException, InvalidPriceException {
        Customer customer = new Customer();
        customer.setName("Alina");
        customer.setPhoneNumber("+37498000000");

        Order order = new Order();
        Pizza pizza = new Pizza();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.Bacon, Ingredient.Salami, Ingredient.Tomato_paste, Ingredient.Bacon,
                Ingredient.Salami, Ingredient.Tomato_paste, Ingredient.Bacon};
        Ingredient[] ingredients1 = {Ingredient.Corn, Ingredient.Olives, Ingredient.Pepperoni, Ingredient.Cheese};

        Ingredient[] ingredients2 = pizza.addIngredient(ingredients);
        Ingredient[] ingredients3 = pizza.addIngredient(ingredients1);

        order.addPizza("MyPizza", PizzaType.CLOSED, ingredients2, 2);
        order.addPizza("MyPizza2", PizzaType.REGULAR, ingredients3, 5);

        order.addDrink("Sprite", DrinkType.SPRITE_LARGE, 8);
        order.addDrink("CoCa-Cola", DrinkType.COLA_SMALL, 3);
        order.addDrink("Fanta", DrinkType.FANTA_LARGE, 3);
        Printer.printCheck(order);
    }
}

