package homework_5.Robert_Nazaryan.pizza;

public class Pizza {

    private String pizzaType;
    private String[] ingredients;
    private double price;
    private int index;
    private final double regularPrice = 1;
    private final double closedPrice = 1.5;
    private final double tomatoPrice = 1;
    private final double cheesePrice = 1;
    private final double salamiPrice = 1.5;
    private final double baconPrice = 1.2;
    private final double garlicPrice = 0.3;
    private final double cornPrice = 0.7;
    private final double pepperoniPrice = 0.6;
    private final double olivesPrice = 0.5;

    public Pizza() {
        price = 0;
        ingredients = new String[7];
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
        if (pizzaType == "closed" || pizzaType == "Closed") {
            price += closedPrice;
        } else {
            price += regularPrice;
        }
    }

    public void addIngredient(String item) {
        if (index < 8) {
            for (int i = 0; i < index; i++) {
                if (item == ingredients[i]) {
                    System.out.println("Check the order again!");
                    return;
                }
            }
            ingredients[index++] = item;
            switch (item) {
                case "Tomato":
                    this.price += tomatoPrice;
                    break;
                case "tomato":
                    this.price += tomatoPrice;
                    break;
                case "Cheese":
                    this.price += cheesePrice;
                    break;
                case "cheese":
                    this.price += cheesePrice;
                    break;
                case "Salami":
                    this.price += salamiPrice;
                    break;
                case "salami":
                    this.price += salamiPrice;
                    break;
                case "Bacon":
                    this.price += baconPrice;
                    break;
                case "bacon":
                    this.price += baconPrice;
                    break;
                case "Garlic":
                    this.price += garlicPrice;
                    break;
                case "garlic":
                    this.price += garlicPrice;
                    break;
                case "Corn":
                    this.price += cornPrice;
                    break;
                case "corn":
                    this.price += cornPrice;
                    break;
                case "Pepperoni":
                    this.price += pepperoniPrice;
                    break;
                case "pepperoni":
                    this.price += pepperoniPrice;
                    break;
                case "Olives":
                    this.price += olivesPrice;
                    break;
                case "olives":
                    this.price += olivesPrice;
                    break;
            }

        } else {
            System.out.println("Pizza is already full!");
        }
    }

    public void getIngredients() {
        for (int i = 0; i < index; i++) {
            System.out.println(ingredients[i]);
        }
    }

    public double getPrice() {
        return price;
    }
}
