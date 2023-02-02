package homework_5.Roza_Petrosyan.pizza;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Order {
    private static String order_number;
    private static int customer_number;
    private static String customer_name;
    public List<Order.Pizza> pizza = new ArrayList<>(10);
    public LocalTime order_time = LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));

    public static String getOrder_number() {
        return order_number;
    }

    public static int getCustomer_number() {
        return customer_number;
    }

    public static String getCustomer_name() {
        return customer_name;
    }

    public static void setOrder_number(String order_number) {
        Order.order_number = order_number;
    }

    public static void setCustomer_number(int customer_number) {
        Order.customer_number = customer_number;
    }

    public static void setCustomer_name(String customer_name) {
        Order.customer_name = customer_name;
    }

    public void checkOrderNumber(String order_number) {
        if (!order_number.matches("^[0-9]{5}$")) {
            System.out.println("Order number must be 5 digit");
        }
    }

    public static class Pizza {
        private String pizza_name;
        private static String[][] ingredients = {
                {"Tomato paste", "1$"}, {"Cheese", "1$"}, {"Salami", "1.5$"},
                {"Bacon", "1.2$"}, {"Garlic", "0.3$"}, {"Corn", "0.7$"},
                {"Pepperoni", "0.6$"}, {"Olives", "0.5$"}, {"Pepper", "0.6$"}
        };

        public static String[] margaritaPizzaIngredients;
        private static String[] salamiPizzaIngredients;
        private static String[] pepperoniPizzaIngredients;
        private String pizza_type;
        private static String[][] pizza_type_array = {
                {"Regular", "1$"}, {"Pizza Base (Calzone)", "1.5$"}
        };

        private int quantity;

        private static double amountOfMargaritaIngredients, amountOfSalamiIngredients, amountOfPepperoniIngredients;

        private static String[] regular_pizza_type;
        private static String[] calzone_pizza_type;

        private static double price_of_regular, price_of_calzone;

        Pizza(String pizza_name, String pizza_type, int quantity) {
            this.pizza_name = pizza_name;
            this.quantity = quantity;
            this.pizza_type = pizza_type;
        }

        public void checkPizzaName(String pizza_name) {
            if (pizza_name.length() >= 4 && pizza_name.length() <= 20 && pizza_name.matches("\\p{IsLatin}+")) {
                this.pizza_name = pizza_name;
                System.out.println(this.pizza_name);
            } else {
                this.pizza_name = getCustomer_name() + "_" + getOrder_number();
                System.out.println(this.pizza_name);
            }
        }

        public void displayPizzaAttributes() {
            System.out.println("[" + Order.getOrder_number() + ":" + Order.getCustomer_number() + ":" + this.pizza_name + ":" + this.quantity + "]");
        }

        public static <T> boolean isDuplicate(final T[] values) {
            return Arrays.stream(values).distinct().count() != values.length;
        }

        public void addIngredient(String pizza_name, String[] ingredients) {
//            checkPizzaName(pizza_name);
            List<String> list = Arrays.asList(ingredients);
            if (pizza_name.equals("Margarita")) {
                if (new HashSet<>(list).containsAll(Arrays.asList("Tomato paste", "Pepper", "Garlic", "Bacon"))) {
                    System.out.println(pizza_name + " pizza is full");
                }
                margaritaPizzaIngredients = ingredients;
            }

            if (pizza_name.equals("Salami")) {
                if (new HashSet<>(list).containsAll(Arrays.asList("Tomato paste", "Cheese", "Salami", "Olives"))) {
                    System.out.println(pizza_name + " pizza is full");
                }
                salamiPizzaIngredients = ingredients;

            }

            if (pizza_name.equals("PepperoniOro")) {
                if (new HashSet<>(list).containsAll(Arrays.asList("Tomato paste", "Cheese", "Pepperoni", "Olives"))) {
                    System.out.println(pizza_name + " pizza is full");
                }
                pepperoniPizzaIngredients = ingredients;

            }

            if (isDuplicate(ingredients)) {
                System.out.println("Please check your order again!");
            }
        }

        public static void printIngredients(String pizza_name) {
            String[] ingredients = new String[0];
            switch (pizza_name) {
                case "Margarita":
                    ingredients = margaritaPizzaIngredients;
                    break;
                case "Salami":
                    ingredients = salamiPizzaIngredients;
                    break;
                case "PepperoniOro":
                    ingredients = pepperoniPizzaIngredients;
                    break;
            }
            List<String> list = Arrays.asList(ingredients);

            for (String[] el : Order.Pizza.ingredients) {
                List<String> el_list = Arrays.asList(el);
                for (String inner_el : el) {
                    if (list.contains(inner_el)) {
                        switch (pizza_name) {
                            case "Margarita":
                                margaritaPizzaIngredients = el_list.toArray(new String[0]);
                                System.out.println(toString(margaritaPizzaIngredients));
                                for (int i = 0; i < margaritaPizzaIngredients.length; i++) {
                                    if (i % 2 != 0) {
                                        margaritaPizzaIngredients[i] = margaritaPizzaIngredients[i].replace("$", "");
                                        amountOfMargaritaIngredients += Double.parseDouble(margaritaPizzaIngredients[i]);
                                    }
                                }
                                break;
                            case "Salami":
                                salamiPizzaIngredients = el_list.toArray(new String[0]);
                                System.out.println(toString(salamiPizzaIngredients));
                                for (int i = 0; i < salamiPizzaIngredients.length; i++) {
                                    if (i % 2 != 0) {
                                        salamiPizzaIngredients[i] = salamiPizzaIngredients[i].replace("$", "");
                                        amountOfSalamiIngredients += Double.parseDouble(salamiPizzaIngredients[i]);
                                    }
                                }
                                break;
                            case "PepperoniOro":
                                pepperoniPizzaIngredients = el_list.toArray(new String[0]);
                                System.out.println(toString(pepperoniPizzaIngredients));
                                for (int i = 0; i < pepperoniPizzaIngredients.length; i++) {
                                    if (i % 2 != 0) {
                                        pepperoniPizzaIngredients[i] = pepperoniPizzaIngredients[i].replace("$", "");
                                        amountOfPepperoniIngredients += Double.parseDouble(pepperoniPizzaIngredients[i]);
                                    }
                                }
                                break;
                        }

                    }
                }
            }
        }

        private static void printPizzaTypes(String pizza_type) {
            if (pizza_type.equals("Regular")) {
                regular_pizza_type = pizza_type_array[0];
                System.out.println(toString(regular_pizza_type));

                for (int i = 0; i < regular_pizza_type.length; i++) {
                    if (i % 2 != 0) {
                        regular_pizza_type[i] = regular_pizza_type[i].replace("$", "");
                        price_of_regular = Double.parseDouble(regular_pizza_type[i]);
                    }
                }
            } else {
                calzone_pizza_type = pizza_type_array[1];
                System.out.println(toString(calzone_pizza_type));

                for (int i = 0; i < calzone_pizza_type.length; i++) {
                    if (i % 2 != 0) {
                        calzone_pizza_type[i] = calzone_pizza_type[i].replace("$", "");
                        price_of_calzone = Double.parseDouble(calzone_pizza_type[i]);
                    }
                }
            }
        }

        public static void printCheck(List<Order.Pizza> pizza) {
            System.out.println("********************************");
            System.out.println("Order: " + getOrder_number());
            System.out.println("Client: " + getCustomer_number());
            for (Pizza value : pizza) {
                System.out.println("Name: " + value.pizza_name);
                System.out.println("--------------------------------");
                printPizzaTypes(value.pizza_type);
                printIngredients(value.pizza_name);
                System.out.println("--------------------------------");
                if (value.pizza_type.equals("Regular")) {
                    switch (value.pizza_name) {
                        case "Margarita" ->
                                System.out.println("Amount: " + (amountOfMargaritaIngredients + price_of_regular) + "$");
                        case "PepperoniOro" ->
                                System.out.println("Amount: " + (amountOfPepperoniIngredients + price_of_regular) + "$");
                        case "Salami" ->
                                System.out.println("Amount: " + (amountOfSalamiIngredients + price_of_regular) + "$");
                    }
                } else {
                    switch (value.pizza_name) {
                        case "Margarita" ->
                                System.out.println("Amount: " + (amountOfMargaritaIngredients + price_of_calzone) + "$");
                        case "PepperoniOro" ->
                                System.out.println("Amount: " + (amountOfPepperoniIngredients + price_of_calzone) + "$");
                        case "Salami" ->
                                System.out.println("Amount: " + (amountOfSalamiIngredients + price_of_calzone) + "$");
                    }
                }
                System.out.println("Quantity: " + value.quantity);
                System.out.println("--------------------------------");
            }
            System.out.println("Total amount: " + (
                    (amountOfMargaritaIngredients * pizza.get(2).quantity) +
                            (amountOfSalamiIngredients * pizza.get(1).quantity) +
                            (amountOfPepperoniIngredients * pizza.get(0).quantity) +
                            (2 * price_of_calzone) + price_of_regular) + "$");
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

}
