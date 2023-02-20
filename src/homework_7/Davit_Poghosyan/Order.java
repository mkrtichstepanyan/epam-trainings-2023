package homework_7.Davit_Poghosyan;

public class Order {
    private static final int MAX_PIZZA_AMOUNT = 10;
    private static final int MAX_DRINK_AMOUNT = 5;
    private static final int BASE_ORDER_NUMBER = 10000;
    private static int initialId = BASE_ORDER_NUMBER;

    private int index = 0;
    private int orderNumber;
    private Customer customer;
    private Pizza[] pizzas = new Pizza[10];
    private Drink[] drinks = new Drink[5];

    Order() {
        orderNumber = initialId++;
    }

    public void addPizza(String pizzaName, PizzaType type,
                         Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }
        int pizzaIndex = index++;
        String validPizzaName = getValidPizzaName(pizzaName, pizzaIndex);
        pizzas[pizzaIndex] = new Pizza(validPizzaName, type, ingredients, quantity);
    }

    public void addDrink(DrinkType drink, int quantity) {
        if (quantity > MAX_DRINK_AMOUNT) {
            System.out.println("hop axper jan!!");
            return;
        }
        int drinkIndex = index++;
        drinks[drinkIndex] = new Drink(drink, quantity);

    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double calculateTotalOrderPrice() {
        double price = 0.0;
        for (Pizza pizza : pizzas) {
            if (pizza != null) {
                price = price + (pizza.calculatePrice() * pizza.getQuantity());
            }
        }
        for (Drink drink : drinks) {
            if (drink != null) {
                price = price + drink.getDrink().getPrice() * drink.getQuantity();
            }
        }
        return price;
    }

    public void printTotalPrice() {
        System.out.println(calculateTotalOrderPrice());
    }

    public void printOrderAttributes() {
        for (Pizza pizza : pizzas) {
            if (pizza != null) {
                System.out.println("[" + orderNumber + customer.getNumber() + " " + pizza.getName() + " " + pizza.getQuantity() + "]");
            }
        }
    }

    public void printOrderNumberAndClientNumber() {
        System.out.println("Order: " + orderNumber + "\nClient: " + customer.getNumber());
    }

    public void printPizzaAttributes() {
        for (Pizza pizza : pizzas) {
            if (pizza != null) {
                System.out.println("Name " + pizza.getName());
                Printer.printDelimiter();
                System.out.println("Pizza base(" + pizza.getPizzaType().getName() + ") " + pizza.getPizzaType().getPrice() + "$");
                if (pizza.getIngredient() == null) {
                    return;
                } else {
                    for (Ingredient ingredient : pizza.getIngredients()) {
                        System.out.println(ingredient.getName() + " " + ingredient.getPrice() + "$");
                    }
                }
                Printer.printDelimiter();
                System.out.println("Amount " + pizza.calculatePrice() + "$");
                System.out.println("Quantity  " + pizza.getQuantity());
            }
        }
    }

    public void printDrinkAttributes() {
        for (Drink drink : drinks) {
            if (drink != null) {
                System.out.println("Drink " + drink.getDrink().getName() + "\nBrand " + drink.getDrink().getBrand() + "\nQuantity " + drink.getQuantity() + "\nAmount " + drink.getDrink().getPrice() + "$");
                Printer.printDelimiter();
            }
        }
    }

    private String getValidPizzaName(String pizzaName, int pizzaIndex) {
        String validPizzaName = pizzaName;
        if (!isValidPizzaName(pizzaName)) {
            validPizzaName = customer.getName() + "_" + pizzaIndex;
        }
        return validPizzaName;
    }

    private boolean isValidPizzaName(String pizzaName) {
        return pizzaName != null && pizzaName.length() > 4 && pizzaName.length() < 20;
    }
}
