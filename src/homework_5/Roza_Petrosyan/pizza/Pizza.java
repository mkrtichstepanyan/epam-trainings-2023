package homework_5.Roza_Petrosyan.pizza;

import java.util.*;

public class Pizza {
    private String pizza_name;
    public static Order order;
    public static Customer customer;

    public static PizzaIngredients pizzaIngredients;
    public PizzaType pizza_type_list;
    private String pizza_type;


    private int quantity;

    private double amountOfIngredients;
    private static List<String[]> currentPizzaIngredients = new ArrayList<>();
    ;

    private String[] regular_pizza_type;
    private String[] calzone_pizza_type;

    private double price_of_regular, price_of_calzone;

    Pizza(String pizza_name, String pizza_type, int quantity) {
        this.pizza_name = pizza_name;
        this.quantity = quantity;
        this.pizza_type = pizza_type;
    }

    Pizza(Order order, Customer customer, PizzaIngredients pizzaIngredients, PizzaType pizza_type_list) {
        Pizza.order = order;
        Pizza.customer = customer;
        Pizza.pizzaIngredients = pizzaIngredients;
        this.pizza_type_list = pizza_type_list;
    }

    public void checkPizzaName(String pizza_name) {
        if (pizza_name.length() >= 4 && pizza_name.length() <= 20 && pizza_name.matches("\\p{IsLatin}+")) {
            this.pizza_name = pizza_name;
            System.out.println(this.pizza_name);
        } else {
            this.pizza_name = customer.getCustomer_name() + "_" + order.getOrder_number();
            System.out.println(this.pizza_name);
        }
    }

    public void displayPizzaAttributes() {
        System.out.println("[" + order.getOrder_number() + ":" + customer.getCustomer_number() + ":" + this.pizza_name + ":" + this.quantity + "]");
    }

    public static <T> boolean isDuplicate(final T[] values) {
        return Arrays.stream(values).distinct().count() != values.length;
    }

    public void addIngredient(String[] ingredients) {
        List<String> list = Arrays.asList(ingredients);
        for (String[] items : pizzaIngredients.getCurrentPizzaIngredients()) {
            if (new HashSet<>(list).containsAll(Arrays.asList(items))) {
                System.out.println(pizza_name + " pizza is full");
                break;
            }
        }

        currentPizzaIngredients.add(ingredients);

        if (isDuplicate(ingredients)) {
            System.out.println("Please check your order again!");
        }
    }

    public void printIngredients(String pizza_name) {
        String[] ingredients = new String[0];
        switch (pizza_name) {
            case "Margarita":
                ingredients = currentPizzaIngredients.get(0);
                amountOfIngredients = 0;
                break;
            case "Salami":
                ingredients = currentPizzaIngredients.get(1);
                amountOfIngredients = 0;
                break;
            case "PepperoniOro":
                ingredients = currentPizzaIngredients.get(2);
                amountOfIngredients = 0;
                break;
        }


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

    private void printPizzaTypes(String pizza_type) {
        if (pizza_type.equals("Regular")) {
            regular_pizza_type = pizza_type_list.getPizza_type_list()[0];
            System.out.println(toString(regular_pizza_type));

            for (int i = 0; i < regular_pizza_type.length; i++) {
                if (i % 2 != 0) {
                    regular_pizza_type[i] = regular_pizza_type[i].replace("$", "");
                    price_of_regular = Double.parseDouble(regular_pizza_type[i]);
                }
            }
        } else {
            calzone_pizza_type = pizza_type_list.getPizza_type_list()[1];
            System.out.println(toString(calzone_pizza_type));

            for (int i = 0; i < calzone_pizza_type.length; i++) {
                if (i % 2 != 0) {
                    calzone_pizza_type[i] = calzone_pizza_type[i].replace("$", "");
                    price_of_calzone = Double.parseDouble(calzone_pizza_type[i]);
                }
            }
        }
    }

    public void printCheck(List<Pizza> pizza) {
        System.out.println("********************************");
        System.out.println("Order: " + order.getOrder_number());
        System.out.println("Client: " + customer.getCustomer_number());
        double total_amount = 0;
        for (Pizza value : pizza) {
            System.out.println("Name: " + value.pizza_name);
            System.out.println("--------------------------------");
            printPizzaTypes(value.pizza_type);
            printIngredients(value.pizza_name);
            System.out.println("--------------------------------");
            if (value.pizza_type.equals("Regular")) {
                System.out.println("Amount: " + (amountOfIngredients + price_of_regular) + "$");
                total_amount += ((amountOfIngredients + price_of_regular) * value.quantity);

            } else {
                System.out.println("Amount: " + (amountOfIngredients + price_of_calzone) + "$");
                total_amount += ((amountOfIngredients + price_of_calzone) * value.quantity);

            }
            System.out.println("Quantity: " + value.quantity);
            System.out.println("--------------------------------");
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

