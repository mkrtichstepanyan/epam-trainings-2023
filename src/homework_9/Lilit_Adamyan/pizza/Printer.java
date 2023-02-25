package homework_9.Lilit_Adamyan.pizza;

public class Printer {


    public static void printCheck(Order order) {
        System.out.println("*************************");
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getName());
        printPizza(order.getPizzas());

    }

    public static void printPizza(Pizza[] pizzas) {

        double totalAmount = 0;
        for (Pizza pizza : pizzas) {
            if (pizza != null) {
                System.out.println("Name: " + pizza.getName());
                System.out.println("____________________________");

                double pizzaAmount = 0;
                for (int i = 0; i < Pizza.getIndexOf(); i++) {
                    Ingredient ingredient = pizza.getIngredients()[i];
                    if (ingredient != null) {
                        double ingredientPrice = ingredient.getPrice();
                        System.out.println(ingredient.getName() + " " + ingredientPrice + " €");
                        pizzaAmount += ingredientPrice;
                    }
                }
                pizzaAmount += (pizza.getPizzaType().equals("Pizza Base (Calzone)") ? 1.5 : 1);
                printLine();
                System.out.println("Amount: " + pizzaAmount + " €");
                System.out.println("Quantity: " + pizza.getQuantity());
                printLine();
                totalAmount += pizzaAmount * pizza.getQuantity();

            }

        }
        System.out.println("Total amount: " + totalAmount + " €");
        leadingLine();
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void printLine() {
        System.out.println("______________________");
    }
}
