package homework_5.Karen_Sargsyan.Pizza;

public class CheckPrinter {

    public static void printCheck(Order order) {
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Customer: " + order.getCustomer().getCustomerNumber());
        double totalAmount = 0;

        for (int i = 0; i < order.getIndex(); i++) {
            Pizza pizza = order.getPizzas()[i];
            System.out.println("Name: " + pizza.getNamePizza());
            System.out.println("-------------------------");
            PizzaType pizzaType = pizza.getPizzaType();
            System.out.println(pizzaType);
            double amountOfPizza = pizzaType.getPrice();
            for (int j = 0; j < pizza.getIngredientIndex(); j++) {
                Ingredient ingredient = pizza.getIngredients()[j];
                System.out.println(ingredient);
                amountOfPizza += ingredient.getPrice();
            }
            int quantity = pizza.getQuantity();
            totalAmount += amountOfPizza * quantity;
            System.out.println("-------------------------");
            System.out.println("Amount: " + amountOfPizza);
            System.out.println("Quantity: " + quantity);
            System.out.println("-------------------------");
        }
        System.out.println("Total amount: " + totalAmount);
        System.out.println("***************************");
    }

}
