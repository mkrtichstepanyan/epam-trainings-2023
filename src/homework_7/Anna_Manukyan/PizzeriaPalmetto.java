package homework_7.Anna_Manukyan;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");

        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};

        order.addPizza("MyPizza", PizzaType.CALZONE, ingredients, 10);
        order.addPizza("MyPizza2", PizzaType.REGULAR, ingredients, 5);


//        Printer.printCheck(order);

//        Scanner scanner = new Scanner(System.in);
//        int quantity = scanner.nextInt();

        Ingredient[] ingredientsForMargarita = {Ingredient.TOMATO_PASTE,Ingredient.GARLIC,Ingredient.BACON};
        Ingredient[] ingredientsForPepperoniOro = {Ingredient.TOMATO_PASTE,Ingredient.CHEESE,Ingredient.SALAMI,Ingredient.OLIVES};

        Pizza pizzaBasePZZ = new Pizza("BasePZZ", PizzaType.CALZONE, ingredientsForPepperoniOro, 12);

        Customer customer1 = new Customer();
        customer1.setName("First customer");
        Order secondOrder = new Order();
        secondOrder.setCustomer(customer1);
        secondOrder.addPizza("Margarita", PizzaType.REGULAR, ingredientsForMargarita, 2);
        secondOrder.addPizza("PepperoniOro", PizzaType.CALZONE, ingredientsForPepperoniOro, 3);
        Printer.printCheck(secondOrder);
    }
}
