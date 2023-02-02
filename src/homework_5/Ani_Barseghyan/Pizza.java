package homework_5.Ani_Barseghyan;

public class Pizza {
    private static int orderNumber;
    private static int customerNumber;
    private static String pizzaName;
    private static char pizzaType;
    private static int quantity;
    private static String[] ingredients;
    public static double cost = 0;
    public static double crustCost = 0;

    Pizza() {

    }

    public void setOrderNumber(int orderNumber) {
        Pizza.orderNumber = orderNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        Pizza.customerNumber = customerNumber;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        if (pizzaName.length() < 4 || pizzaName.length() > 20) {
            Pizza.pizzaName = "customer_name_" + customerNumber;
        } else {
            Pizza.pizzaName = pizzaName;
        }
    }

    public void setPizzaType(char pizzaType) {
        Pizza.pizzaType = pizzaType;
    }

    public void setQuantity(int quantity) {
        Pizza.quantity = quantity;
    }

    public static String[] getIngredients() {
        return ingredients;
    }

    public static void setIngredients(String[] ingredients) {
        Pizza.ingredients = ingredients;
    }

    public static void displayOrder() {
        System.out.println("[" + orderNumber + " : " + customerNumber + " : " + pizzaName + " : " + quantity + "]");
    }

    public static double addIngredient(String[] ingredients) {
        if (pizzaType == 'b' || pizzaType == 'B') {
            cost++;
            crustCost = 1;
        } else {
            cost += 1.5;
            crustCost = 1.5;
        }
        for (String ingr : ingredients) {
            switch (ingr) {
                case "Tomato paste":
                case "Cheese": {
                    cost += 1;
                    break;
                }
                case "Salami": {
                    cost += 1.5;
                    break;
                }
                case "Bacon": {
                    cost += 1.2;
                    break;
                }
                case "Garlic": {
                    cost += 0.3;
                    break;
                }
                case "Corn": {
                    cost += 0.7;
                    break;
                }
                case "Pepperoni": {
                    cost += 0.6;
                    break;
                }
                case "Olives": {
                    cost += 0.5;
                    break;
                }
            }
        }
        return cost;
    }

    public static void printCheck() {
        System.out.println("*********************");
        System.out.println("Order: " + orderNumber);
        System.out.println("Order: " + customerNumber);
        System.out.println("Pizza: " + pizzaName);
        System.out.println("---------------------");
        System.out.println("Pizza Base " + pizzaType + " " + crustCost);
        for (int i = 0; i < ingredients.length; i++) {
            System.out.println( ingredients[i] + " " + cost);
        }
        System.out.println("---------------------");
        System.out.println("Amount " + cost);
        System.out.println("Quantity " + quantity);
        System.out.println("*********************");
    }
}
