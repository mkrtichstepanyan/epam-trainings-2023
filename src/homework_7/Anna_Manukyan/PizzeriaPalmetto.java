package homework_7.Anna_Manukyan;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");

        Order orderForPizza = new Order();
        orderForPizza.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};

        Pizza pizza1 = new Pizza("MyPizza", PizzaType.CALZONE, ingredients, 10, FoodType.PIZZA);
        Pizza pizza2 = new Pizza("MyPizza2", PizzaType.REGULAR, ingredients, 5, FoodType.PIZZA);
        orderForPizza.addFood(pizza1);
        orderForPizza.addFood(pizza2);

        printer.printCheck(orderForPizza);

        Ingredient[] ingredientsForMargarita = {Ingredient.TOMATO_PASTE, Ingredient.GARLIC, Ingredient.BACON};
        Ingredient[] ingredientsForPepperoniOro = {Ingredient.TOMATO_PASTE, Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.OLIVES};

        Pizza pizzaBasePZZ = new Pizza("BasePZZ", PizzaType.CALZONE, ingredientsForPepperoniOro, 12, FoodType.PIZZA);

        Customer customer1 = new Customer();
        customer1.setName("First customer");
        Order firstOrderForPizza = new Order();
        firstOrderForPizza.setCustomer(customer1);
        Pizza margarita = new Pizza("Margarita", PizzaType.REGULAR, ingredientsForMargarita, 2, FoodType.PIZZA);
        Pizza pepperoniOro = new Pizza("PepperoniOro", PizzaType.CALZONE, ingredientsForPepperoniOro, 3, FoodType.PIZZA);
        firstOrderForPizza.addFood(margarita);
        firstOrderForPizza.addFood(pepperoniOro);
        printer.printCheck(firstOrderForPizza);


        Customer customer2 = new Customer();
        customer1.setName("Second customer");
        Order secondOrder = new Order();
        secondOrder.setCustomer(customer2);
        Pizza margaritaForSecondOrder = new Pizza("Margarita", PizzaType.REGULAR, ingredientsForMargarita, 8, FoodType.PIZZA);
        secondOrder.addFood(margaritaForSecondOrder);
        Food darkChocolate = new Sweets("Dark Chocolate", 10, FoodType.SWEETS);
        secondOrder.addFood(darkChocolate);
        printer.printCheck(secondOrder);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input your name");
//        String orderItem ;
//        int quantity;
//        char choice;
//        String ingredients;
//        do {
//            System.out.println("Please input what do you want to order?");
//            orderItem = scanner.next();
//            if (orderItem.toUpperCase().equals(FoodType.PIZZA)) {
//                Pizza pizza = new Pizza();
//                System.out.println("Please input name");
//                orderItem = scanner.next();
//                pizza.setName(orderItem);
//                System.out.println("Please input quantity");
//                quantity = scanner.nextInt();
//                pizza.setQuantity(quantity);
//                System.out.println("Please input pizza type. Regular or calzone");
//                orderItem = scanner.next().toUpperCase();
//                if (orderItem.equals(PizzaType.CALZONE)){
//                    pizza.setPizzaType(PizzaType.CALZONE);
//                } else {
//                    pizza.setPizzaType(PizzaType.REGULAR);
//                }
//                System.out.println("Please input ingredients with comma");
//                ingredients  = scanner.next();
//
//            }
//            System.out.print("Do you want to continue y/n? ");
//            choice = scanner.next().charAt(0);
//        } while (choice == 'y' || choice == 'Y');

    }
}
