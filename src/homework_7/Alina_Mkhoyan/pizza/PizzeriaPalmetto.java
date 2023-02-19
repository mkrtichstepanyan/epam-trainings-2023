package homework_7.Alina_Mkhoyan.pizza;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Alina");
        customer.setPhoneNumber("+37498000000");

        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};
        Ingredient[] ingredients1 = {Ingredient.CORN, Ingredient.OLIVES, Ingredient.PEPERONI, Ingredient.CHEESE};
        order.addPizza("MyPizza", PizzaType.CALZONE, ingredients, 2);
        order.addPizza("MyPizza2", PizzaType.REGULAR, ingredients1, 5);
        order.addDrink("Sprite", DrinkType.SPRITE_LARGE, 8);
        order.addDrink("Cola-Cola", DrinkType.COLA_MIDDLE, 5);
        order.addDrink("Fanta", DrinkType.FANTA_SMALL, 3);
        Printer.printCheck(order);
    }
}

