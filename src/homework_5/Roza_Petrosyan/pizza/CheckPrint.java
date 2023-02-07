package homework_5.Roza_Petrosyan.pizza;

public class CheckPrint {
    private double price_of_types;
    private double amountOfIngredients;

    public void printIngredients(Pizza pizza) {
        String[] ingredients = pizza.getIngredients();
        amountOfIngredients = 0;

        for (String ingredient : ingredients) {
            for (Ingredients elements : Ingredients.values()) {
                if (ingredient.equals(elements.getName())) {
                    System.out.println(elements.getName() + " " + elements.getPrice() + "$");
                    amountOfIngredients += elements.getPrice();

                }
            }
        }
    }

    private void printPizzaTypes(Pizza pizza) {
        for (Types elements : Types.values()) {
            if (pizza.getPizzaType().equals(elements.getName())) {
                System.out.println(elements.getName() + " " + elements.getPrice() + "$");

                price_of_types = elements.getPrice();

            }
        }
    }

    public void printCheck(Order order) {
        System.out.println("********************************");
        System.out.println("Order: " + order.getOrder_number());
        System.out.println("Client: " + order.getCustomer().getCustomerNumber());
        double total_amount = 0;
        for (Pizza value : order.getPizzas()) {
            if (value != null) {
                System.out.println("Name: " + value.getPizzaName());
                System.out.println("--------------------------------");
                printPizzaTypes(value);
                printIngredients(value);
                System.out.println("--------------------------------");
                for (Types elements : Types.values()) {
                    if (value.getPizzaType().equals(elements.getName())) {
                        System.out.println("Amount: " + (amountOfIngredients + price_of_types) + "$");
                        total_amount += ((amountOfIngredients + price_of_types) * value.getQuantity());
                    }
                }

                System.out.println("Quantity: " + value.getQuantity());
                System.out.println("--------------------------------");
            }
        }
        System.out.println("Total amount: " + (total_amount + "$"));
        System.out.println("********************************");

    }

}
