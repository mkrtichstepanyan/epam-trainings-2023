package homework_5.Ani_Kovalenko.Pizza_With_System.in;

public class CheckPrinter {
    public static void printCheck(Order order) {
        Pizza[] pizzaArray = order.getPizzaArray();

        System.out.println("****************************");
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getCustomerId());

        for (int i = 0; i < Order.getIndex(); i++) {
            Pizza pizza = pizzaArray[i];
            System.out.println("Pizza Name: " + pizza.getPizzaName());
            System.out.println("----------------------------");
            if (pizza.getPizzaType().equals("regular")) {
                System.out.println("Pizza Base(Regular) 1.0 $");
            } else if (pizza.getPizzaType().equals("closed")) {
                System.out.println("Pizza Base(Calzone) 1.5 $");
            }
            for (String ingredient : pizza.getIngredients()) {
                if (ingredient != null) {
                    if (ingredient.equals("tomato")) {
                        System.out.println("Tomato paste " + pizza.getPriceTomato() + "$");
                    } else if (ingredient.equals("cheese")) {
                        System.out.println("Cheese " + pizza.getPriceCheese() + "$");
                    } else if (ingredient.equals("salami")) {
                        System.out.println("Salami " + pizza.getPriceSalami() + "$");
                    } else if (ingredient.equals("bacon")) {
                        System.out.println("Bacon " + pizza.getPriceBacon() + "$");
                    } else if (ingredient.equals("garlic")) {
                        System.out.println("Garlic " + pizza.getPriceGarlic() + "$");
                    } else if (ingredient.equals("corn")) {
                        System.out.println("Corn " + pizza.getPriceCorn() + "$");
                    } else if (ingredient.equals("pepperoni")) {
                        System.out.println("Pepperoni " + pizza.getPricePepperoni() + "$");
                    } else if (ingredient.equals("olives")) {
                        System.out.println("Olives " + pizza.getPriceOlives() + "$");
                    }
                }
            }
            System.out.println("----------------------------");
            System.out.println("Amount: " + pizza.getPrice() + "$");
            System.out.println("Quantity: " + pizza.getPizzaCount());
            System.out.println("----------------------------");
        }
        System.out.println("Total Amount: " + order.calculatePriceTotal() + "$");
        System.out.println("****************************");
    }
}
