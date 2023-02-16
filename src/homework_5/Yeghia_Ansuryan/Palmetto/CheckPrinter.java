package homework_5.Yeghia_Ansuryan.Palmetto;

public class CheckPrinter {

    public static void printCheck(Order order) {
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Customer: " + order.getCustomer().getCustomerNumber());
        double totalAmount = 0;
        for (int i = 0; i < order.getPizzaIndex(); i++) {
            Pizza pizza = order.getPizzas()[i];
            System.out.println("Name: " + pizza.getPizzaName());
            System.out.println("-----------------------------");
            PizzaType pizzaType = pizza.getType();
            System.out.println(pizzaType);
            double amountOfPizza = pizzaType.getPriceOfPizzaType();
            for (int j = 0; j < pizza.getIngredientIndex(); j++) {
                Ingredient ingredient = pizza.getIngredients()[j];
                System.out.println(ingredient);
                amountOfPizza += ingredient.getIngredientPrice();
            }
            int pizzaQuantity = pizza.getPizzaQuantity();
            totalAmount += amountOfPizza * pizzaQuantity;
            System.out.println("-------------------------");
            System.out.println("Amount: " + amountOfPizza);
            System.out.println("Quantity: " + pizzaQuantity);
            System.out.println("-------------------------------");
        }
        System.out.println("Total amount: " + totalAmount);
        System.out.println("****************************");
    }
}
