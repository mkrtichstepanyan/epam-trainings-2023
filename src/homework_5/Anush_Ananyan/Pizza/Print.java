package homework_5.Anush_Ananyan.Pizza;

public class Print {
    private double amount;

    private void printIngredients(Pizza pizza) {
        Ingredients[] ingredients = pizza.getIngredients();
        amount = 0;
        if (ingredients != null) {
            for (Ingredients ingredient : ingredients) {
                if (ingredient != null) {
                    System.out.println(ingredient.getIngredientName() + " "
                            + ingredient.getPriceOfIngredient() + "$");
                    amount += ingredient.getPriceOfIngredient();
                }
            }
        }
    }

    public void printCheck(Order order) {
        System.out.println("*******************************");
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getCostumerNumber());
        double totalAmount = 0;

        for (Pizza pizza : order.getPizzas()) {
            if (!pizza.isDuplicate(pizza.getIngredients()) && pizza.getMaxLength() < 7 && pizza.getIngredients() != null) {
                System.out.println("Name: " + pizza.getPizzaName());
                System.out.println("--------------------");
                System.out.println("Pizza base: (" + pizza.getType().getPizzaTypeName() + ")" +
                        " " + pizza.getType().getPrice() + "$");

                printIngredients(pizza);
                System.out.println("--------------------");
                System.out.println("Amount: " + (amount + pizza.getType().getPrice()));
                totalAmount += (amount + pizza.getType().getPrice()) * pizza.getCount();
                System.out.println("Quantity " + pizza.getCount());
                System.out.println("--------------------");
            }
        }
        System.out.println("Total Amount: " + totalAmount + "$");
        System.out.println("*******************************");
        System.out.println(order.getORDER_TIME());
    }
}
