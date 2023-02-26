package homework_7.Alina_Mkhoyan.pizza;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Alina");
        customer.setPhoneNumber("+37498000000");

        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.Bacon, Ingredient.Salami, Ingredient.Tomato_paste};
        Ingredient[] ingredients1 = {Ingredient.Corn, Ingredient.Olives, Ingredient.Pepperoni, Ingredient.Cheese};
        order.addPizza("MyPizza", PizzaType.CLOSED, ingredients, 2);
        order.addPizza("MyPizza2", PizzaType.REGULAR, ingredients1, 5);
        order.addDrink("Sprite", DrinkType.SPRITE_LARGE, 8);
        order.addDrink("CoCa-Cola", DrinkType.COLA_SMALL, 5);
        order.addDrink("Fanta", DrinkType.COLA_SMALL, 3);
        Printer.printCheck(order);
    }
}

