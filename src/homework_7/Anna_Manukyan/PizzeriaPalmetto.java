package homework_7.Anna_Manukyan;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
//        Customer customer = new Customer();
//        customer.setName("Sevak");
//        customer.setPhoneNumber("+37498000000");
//
//        Order orderForPizza = new OrderForPizza();
//        orderForPizza.setCustomer(customer);
//
//        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};
//
//        Pizza pizza1 = new Pizza("MyPizza", PizzaType.CALZONE, ingredients, 10);
//        Pizza pizza2 = new Pizza("MyPizza2", PizzaType.REGULAR, ingredients, 5);
//        orderForPizza.addFood(pizza1, FoodType.PIZZA);
//        orderForPizza.addFood(pizza2, FoodType.PIZZA);

//        Printer.printCheck(order);

//        Scanner scanner = new Scanner(System.in);
//        int quantity = scanner.nextInt();

        Ingredient[] ingredientsForMargarita = {Ingredient.TOMATO_PASTE,Ingredient.GARLIC,Ingredient.BACON};
        Ingredient[] ingredientsForPepperoniOro = {Ingredient.TOMATO_PASTE,Ingredient.CHEESE,Ingredient.SALAMI,Ingredient.OLIVES};

        Pizza pizzaBasePZZ = new Pizza("BasePZZ", PizzaType.CALZONE, ingredientsForPepperoniOro, 12, FoodType.PIZZA);

        Customer customer1 = new Customer();
        customer1.setName("First customer");
        Order secondOrderForPizza = new OrderForPizza();
        secondOrderForPizza.setCustomer(customer1);
        Pizza margarita = new Pizza("Margarita", PizzaType.REGULAR, ingredientsForMargarita, 2, FoodType.PIZZA);
        Pizza pepperoniOro = new Pizza("PepperoniOro", PizzaType.CALZONE, ingredientsForPepperoniOro, 3,FoodType.PIZZA);
        secondOrderForPizza.addFood(margarita);
        secondOrderForPizza.addFood(pepperoniOro);
        Printer.printCheck(secondOrderForPizza);
    }
}
