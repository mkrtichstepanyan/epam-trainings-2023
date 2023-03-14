package homework_5.Ani_Kovalenko.Pizza_With_System.in;

import java.util.Scanner;

public class Pizza {
    private String[] ingredients = new String[7];
    private int index = 0;
    private String pizzaName;
    private String pizzaType;
    private int pizzaCount;
    private double price = 0.0;
    private final double priceTomato = 1.0;
    private final double priceCheese = 1.0;
    private final double priceSalami = 1.5;
    private final double priceBacon = 1.2;
    private final double priceGarlic = 0.3;
    private final double priceCorn = 0.7;
    private final double pricePepperoni = 0.6;
    private final double priceOlives = 0.5;

    public Pizza(String pizzaType, String pizzaName, int pizzaCount) {
        if (pizzaType.equals("regular")) {
            this.pizzaType = pizzaType;
            this.price = 1.0;
        } else if (pizzaType.equals("closed")) {
            this.pizzaType = pizzaType;
            this.price = 1.5;
        }
        this.pizzaName = pizzaName;
        this.pizzaCount = pizzaCount;
    }

    public double addIngredient() {
        Scanner console = new Scanner(System.in);
        System.out.println();
        System.out.println("Here is the list of ingredients: tomato; cheese; salami; " +
                "bacon; garlic; corn; pepperoni; olives");
        a:
        do {
            System.out.println("Enter the name of ingredient or enter 'stop' when you need to stop the process");
            String ingredient = console.next();
            switch (ingredient) {
                case "tomato":
                    if (index > 0) {
                        if (checkDuplicate(ingredient)) {
                            System.out.println(ingredient + " already exists in your list");
                            break;
                        }
                    }
                    ingredients[index++] = ingredient;
                    price += priceTomato;
                    break;
                case "cheese":
                    if (index > 0) {
                        if (checkDuplicate(ingredient)) {
                            System.out.println(ingredient + " already exists in your list");
                            break;
                        }
                    }
                    ingredients[index++] = ingredient;
                    price += priceCheese;
                    break;
                case "salami":
                    if (index > 0) {
                        if (checkDuplicate(ingredient)) {
                            System.out.println(ingredient + " already exists in your list");
                            break;
                        }
                    }
                    ingredients[index++] = ingredient;
                    price += priceSalami;
                    break;
                case "bacon":
                    if (index > 0) {
                        if (checkDuplicate(ingredient)) {
                            System.out.println(ingredient + " already exists in your list");
                            break;
                        }
                    }
                    ingredients[index++] = ingredient;
                    price += priceBacon;
                    break;
                case "garlic":
                    if (index > 0) {
                        if (checkDuplicate(ingredient)) {
                            System.out.println(ingredient + " already exists in your list");
                            break;
                        }
                    }
                    ingredients[index++] = ingredient;
                    price += priceGarlic;
                    break;
                case "corn":
                    if (index > 0) {
                        if (checkDuplicate(ingredient)) {
                            System.out.println(ingredient + " already exists in your list");
                            break;
                        }
                    }
                    ingredients[index++] = ingredient;
                    price += priceCorn;
                    break;
                case "pepperoni":
                    if (index > 0) {
                        if (checkDuplicate(ingredient)) {
                            System.out.println(ingredient + " already exists in your list");
                            break;
                        }
                    }
                    ingredients[index++] = ingredient;
                    price += pricePepperoni;
                    break;
                case "olives":
                    if (index > 0) {
                        if (checkDuplicate(ingredient)) {
                            System.out.println(ingredient + " already exists in your list");
                            break;
                        }
                    }
                    ingredients[index++] = ingredient;
                    price += priceOlives;
                    break;
                case "stop":
                    System.out.println();
                    break a;
                default:
                    System.out.println("Please select only from the list ! ");
            }
        } while (index <= 6);
        if (index == 7) {
            System.out.println("The pizza is already full!");
            System.out.println();
        }
        return price;
    }

    private boolean checkDuplicate(String ingredient) {
        for (int i = 0; i < index; i++) {
            if (ingredients[i].equals(ingredient)) {
                return true;
            }
        }
        return false;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public double getPrice() {
        return price * pizzaCount;
    }

    public int getPizzaCount() {
        return pizzaCount;
    }

    public double getPriceBacon() {
        return priceBacon;
    }

    public double getPriceCheese() {
        return priceCheese;
    }

    public double getPriceCorn() {
        return priceCorn;
    }

    public double getPriceGarlic() {
        return priceGarlic;
    }

    public double getPriceOlives() {
        return priceOlives;
    }

    public double getPricePepperoni() {
        return pricePepperoni;
    }

    public double getPriceSalami() {
        return priceSalami;
    }

    public double getPriceTomato() {
        return priceTomato;
    }
}
