package homework_5.Roza_Petrosyan.pizza;

import java.util.Arrays;
import java.util.List;

public class CheckPrint {

    private Order order;
    private PizzaIngredients pizzaIngredients;
    private PizzaType pizzaTypeList;

    private double price_of_regular, price_of_calzone;
    private double amountOfIngredients;

    public CheckPrint(Order order, PizzaIngredients pizzaIngredients, PizzaType pizzaTypeList) {
        this.order = order;
        this.pizzaIngredients = pizzaIngredients;
        this.pizzaTypeList = pizzaTypeList;
    }

    public void printIngredients(Pizza pizza) {
        String[] ingredients = pizza.getCurrentPizzaIngredients();
        amountOfIngredients = 0;

        List<String> list = Arrays.asList(ingredients);
        for (String[] el : pizzaIngredients.getIngredients()) {
            List<String> el_list = Arrays.asList(el);
            for (String inner_el : el) {

                if (list.contains(inner_el)) {
                    ingredients = el_list.toArray(new String[0]);
                    System.out.println(toString(ingredients));
                    ingredients[1] = ingredients[1].replace("$", "");
                    amountOfIngredients += Double.parseDouble(ingredients[1]);

                }

            }

        }
    }

    private void printPizzaTypes(String pizzaType) {
        if (pizzaType.equals("Regular")) {
            System.out.println(pizzaTypeList.getRegularType() + " " + pizzaTypeList.getRegularPrice() + " $");

            price_of_regular = Double.parseDouble(pizzaTypeList.getRegularPrice());

        } else {
            System.out.println(pizzaTypeList.getCalzoneType() + " " + pizzaTypeList.getCalzonePrice() + " $");

            price_of_calzone = Double.parseDouble(pizzaTypeList.getCalzonePrice());
        }
    }

    public void printCheck(Pizza[] pizzaList) {
        System.out.println("********************************");
        System.out.println("Order: " + order.getOrder_number());
        System.out.println("Client: " + order.getCustomer().getCustomer_number());
        double total_amount = 0;
        for (Pizza value : pizzaList) {
            if (value != null) {
                System.out.println("Name: " + value.getPizzaName());
                System.out.println("--------------------------------");
                printPizzaTypes(value.getPizzaType());
                printIngredients(value);
                System.out.println("--------------------------------");
                if (value.getPizzaType().equals("Regular")) {
                    System.out.println("Amount: " + (amountOfIngredients + price_of_regular) + "$");
                    total_amount += ((amountOfIngredients + price_of_regular) * value.getQuantity());

                } else {
                    System.out.println("Amount: " + (amountOfIngredients + price_of_calzone) + "$");
                    total_amount += ((amountOfIngredients + price_of_calzone) * value.getQuantity());

                }
                System.out.println("Quantity: " + value.getQuantity());
                System.out.println("--------------------------------");
            }
        }
        System.out.println("Total amount: " + (total_amount + "$"));
        System.out.println("********************************");

    }

    public static String toString(Object[] a) {
        if (a == null)
            return "null";

        int iMax = a.length - 1;
        if (iMax == -1)
            return "";

        StringBuilder b = new StringBuilder();
        b.append("");
        for (int i = 0; ; i++) {
            b.append(String.valueOf(a[i]));
            if (i == iMax)
                return b.append("").toString();
            b.append(" ");
        }
    }

}
