package homework_5.Roza_Petrosyan.pizza;

public class Print {
    private double amountOfIngredients;

    private void printIngredients(Pizza pizza) {
        Ingredient[] ingredients = pizza.getIngredients();
        amountOfIngredients = 0;

        if(ingredients != null) {
            for (Ingredient ingredient : ingredients) {
                if (ingredient != null) {
                    System.out.println(ingredient.getName() + " " + ingredient.getPrice() + "$");
                    amountOfIngredients += ingredient.getPrice();
                }
            }
        }
    }

    public void printCheck(Order order) {
        if (order.getPizzas() != null) {
            System.out.println("********************************");
            System.out.println("Order: " + order.getOrderNumber());
            System.out.println("Client: " + order.getCustomer().getCustomerNumber());
            double total_amount = 0;
            for (Pizza pizza : order.getPizzas()) {
                if (!pizza.isDuplicate(pizza.getIngredients()) && pizza.getMaxCount() < 7) {
                    PizzaType pizzaType = pizza.getPizzaType();
                    System.out.println("Name: " + pizza.getPizzaName());
                    System.out.println("--------------------------------");
                    System.out.println(pizzaType.getName() + " " + pizzaType.getPrice());
                    printIngredients(pizza);
                    System.out.println("--------------------------------");
                    System.out.println("Amount: " + (amountOfIngredients + pizzaType.getPrice()) + "$");
                    total_amount += ((amountOfIngredients + pizzaType.getPrice()) * pizza.getQuantity());

                    System.out.println("Quantity: " + pizza.getQuantity());
                    System.out.println("--------------------------------");
                }
            }
            System.out.println("Total amount: " + (total_amount + "$"));
            System.out.println("********************************");
        }

    }

}
