package homework_5.Hovhannes_Abrahamyan;

public class CheckPrinter {
    public static String printCheck(Order order) {
        StringBuilder check = new StringBuilder();
        check.append("*************************").append("\n");
        check.append("Order: ").append(order.getOrderNumber()).append("\n");
        check.append("CUstomer: ").append(order.getCustomer().getCustomerNumber()).append("\n");
        double totalAmount = 0;
        for (Pizza pizza : order.getPizzas()) {
            check.append("Pizza name : ").append(pizza.getName()).append("\n");
            check.append("--------------------- ").append(pizza.getName()).append("\n");
            for (Ingredient ingredient : pizza.getIngredients()) {
                check.append("ingredient: ").append(ingredient.getName()).append(ingredient.getPrice()).append("\n");
                check.append("--------------------- ").append(pizza.getName()).append("\n");
            }
            check.append("Amount :").append(pizza.calculatePrice()).append("\n");
            check.append("quantity").append(pizza.getQuantity()).append("\n");
            totalAmount += pizza.calculatePrice() * pizza.getQuantity();
        }
        check.append("Total Amount").append(totalAmount).append("\n");
        return check.toString();
    }
}