package homework_7.Karen_Mikayelyan;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        try {
            customer.setName("Sevak");
        } catch (InvalidNameException n) {
            System.out.println(n);
        }
        try {
            customer.setPhoneNumber("+37498000000");
        } catch (InvalidPhoneNumberException p) {
            System.out.println(p);
        }
        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE, Ingredient.CHEESE, Ingredient.OLIVES, Ingredient.CORN, Ingredient.GARLIC, Ingredient.PEPPERONI};

        try {
            Pizza pizza = new Pizza("MyPizza", PizzaType.CALZONE, ingredients, 11, ProductType.PIZZA);
            Pizza pizza1 = new Pizza("MyPizza2", PizzaType.REGULAR, ingredients, 5, ProductType.PIZZA);
            order.addProduct(pizza);
            order.addProduct(pizza1);
            try {
                pizza.addIngredient(Ingredient.CHEESE);
                pizza.addIngredient(Ingredient.CHEESE);
            } catch (IngredientDuplicateException e) {
                System.out.println(e);
            }
        } catch (IngredientQuantityException e) {
            System.out.println(e);
        }


        Printer.printCheck(order);

        Ingredient[] ingredientsForMargarita = {Ingredient.TOMATO_PASTE, Ingredient.PEPPERONI, Ingredient.GARLIC, Ingredient.BACON};
        Ingredient[] ingredientsForPepperoniOro = {Ingredient.TOMATO_PASTE, Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.OLIVES};
        Ingredient[] ingredientsForBasePZZ = {Ingredient.CHEESE, Ingredient.GARLIC, Ingredient.CORN, Ingredient.OLIVES};

        Customer customer1 = new Customer();
        customer1.setName("Karen");
        Order firstOrder = new Order();
        firstOrder.setCustomer(customer1);
        try {
            Pizza margarita = new Pizza("Margarita", PizzaType.CALZONE, ingredientsForMargarita, 2, ProductType.PIZZA);
            Pizza pepperoniOro = new Pizza("PepperoniOro", PizzaType.CALZONE, ingredientsForPepperoniOro, 3, ProductType.PIZZA);
            Pizza basePZZ = new Pizza("BasePZZ", PizzaType.REGULAR, ingredientsForBasePZZ, 7, ProductType.PIZZA);
            firstOrder.addProduct(margarita);
            firstOrder.addProduct(pepperoniOro);
            firstOrder.addProduct(basePZZ);
            Printer.printCheck(firstOrder);
            try {
                margarita.addIngredient(Ingredient.GARLIC);
                basePZZ.addIngredient(Ingredient.CHEESE);
            } catch (IngredientDuplicateException e) {
                System.out.println(e);
            }
        } catch (IngredientQuantityException e) {
            System.out.println(e);
        }

        Customer customer2 = new Customer();
        customer2.setName("Jack");
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
