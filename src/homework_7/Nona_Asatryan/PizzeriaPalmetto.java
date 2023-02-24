package homework_7.Nona_Asatryan;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");

        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};

        Product pizza = new Pizza("MyPizza", PizzaType.CALZONE, ingredients, 10, ProductType.PIZZA);
        Product pizza1 = new Pizza("MyPizza2", PizzaType.REGULAR, ingredients, 5, ProductType.PIZZA);
        order.addProduct(pizza);
        order.addProduct(pizza1);

        Printer.printCheck(order);

        Ingredient[] ingredientsForMargarita = {Ingredient.TOMATO_PASTE, Ingredient.PEPPERONI, Ingredient.GARLIC, Ingredient.BACON, };
        Ingredient[] ingredientsForPepperoniOro = {Ingredient.TOMATO_PASTE, Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.OLIVES};
        Ingredient[] ingredientsForBasePZZ = {Ingredient.CHEESE, Ingredient.GARLIC, Ingredient.CORN, Ingredient.OLIVES};

        Customer customer1 = new Customer();
        customer1.setName("First Customer");
        Order firstOrder = new Order();
        firstOrder.setCustomer(customer1);
        Pizza pizza2 = new Pizza("Margarita", PizzaType.CALZONE, ingredientsForMargarita, 2, ProductType.PIZZA);
        Pizza pizza3 = new Pizza("PepperoniOro", PizzaType.CALZONE, ingredientsForPepperoniOro, 3, ProductType.PIZZA);
        Pizza pizza4 = new Pizza("BasePZZ", PizzaType.REGULAR, ingredientsForBasePZZ, 9, ProductType.PIZZA);
        pizza2.addIngredient(Ingredient.OLIVES);
        pizza3.addIngredient(Ingredient.GARLIC);
        pizza4.addIngredient(Ingredient.CORN);
        firstOrder.addProduct(pizza2);
        firstOrder.addProduct(pizza3);
        firstOrder.addProduct(pizza4);
        Printer.printCheck(firstOrder);


        Customer customer2 = new Customer();
        customer2.setName("Second Customer");
        Order secondOrder = new Order();
        secondOrder.setCustomer(customer2);
        Pizza margarita1 = new Pizza("Margarita", PizzaType.CALZONE, ingredientsForMargarita, 2, ProductType.PIZZA);
        Product drink1 = new Drink("Juice", DrinkType.JUICE, 3);
        Product drink2 = new Drink("Beer", DrinkType.BEER, 1);
        Product drink3 = new Drink("Coca Cola", DrinkType.COCA_COLA, 1);
        secondOrder.addProduct(margarita1);
        secondOrder.addProduct(drink1);
        secondOrder.addProduct(drink2);
        secondOrder.addProduct(drink3);
        Printer.printCheck(secondOrder);
    }
}
