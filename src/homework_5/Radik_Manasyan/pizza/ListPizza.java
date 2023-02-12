package homework_5.Radik_Manasyan.pizza;

public class ListPizza {
    private String pizzaName = "";
    private static double totalAmount = 0;
    private final String pizzaIngredients = "Tomato Paste 1, Cheese 1, Salami 1.5, Bacon 1.2, " +
            "Garlic 0.3, Corn 0.7, Pepperoni 1.5, Olives 0.5";
    private final String typeOfPizza = "Pizza Base (Calzone)";
    private int countPizza;
    private String checkInformation = "";
    private double totalIngredientsCoast = 1;

    public String getPizzaName() {
        return pizzaName;
    }

    public int getCountPizza() {
        return countPizza;
    }
    public static double getTotalAmount() {
        return totalAmount;
    }

    public void getCheck() {
        System.out.println(checkInformation);
    }

    public void setNameOfPizza(int clientNumber, String nameOfPizza, int countAddPizza) {
        pizzaName = (nameOfPizza.length() > 20 || nameOfPizza.length() < 4) ?
                "customer_name_" + clientNumber : nameOfPizza;
        setCountPizza(countAddPizza);

        if (nameOfPizza.contains("Calzone")) {
            totalIngredientsCoast = 1.5;
        } else {
            totalIngredientsCoast = 1;
        }
    }

    private void setCountPizza(int countOrderOfPizza) {
        if (countPizza > 10) {
            System.out.println("Sorry you can order up to 10 pizza.");
            countPizza = 10;
        } else {
            countPizza = countOrderOfPizza;
        }
    }

    public void addIngredientsInPizzaIngredients(String listOfIngredients) {
        checkInformation += checkHeader();
        boolean flag = true;
        if(flag){
            for (String ingredient : listOfIngredients.split(",")) {
                if (pizzaIngredients.contains(ingredient.trim())) {
                    for (String menuIngredient : pizzaIngredients.split(",")) {
                        if (menuIngredient.contains(ingredient)) {
                            String inMenu = menuIngredient.trim();
                            int ingredientCostIndex = (inMenu.split(" ").length) - 1;

                            checkInformation += inMenu + "0 €\n";
                            totalIngredientsCoast += Double.parseDouble(inMenu.split(" ")[ingredientCostIndex]);
                            break;
                        }
                    }
                } else {
                    System.out.println("There is no " + ingredient + " ingredient in our menu.");
                    flag = false;
                    break;
                }
            }
            checkInformation += checkFooter();
            totalAmount += totalIngredientsCoast * countPizza;
        }else {
            totalAmount = 0;
            checkInformation = "";
            totalIngredientsCoast = 1;

        }
    }
    private String checkHeader() {
        return "Name: " + pizzaName +
                "\n--------------------------------\n" +
                typeOfPizza + " " + totalIngredientsCoast + "0 €\n";
    }

    private String checkFooter() {
        return "\n--------------------------------" +
                "\nAmount: " + totalIngredientsCoast + "0 €" +
                "\nQuantity: " + countPizza +
                "\n--------------------------------\n";
    }
}
