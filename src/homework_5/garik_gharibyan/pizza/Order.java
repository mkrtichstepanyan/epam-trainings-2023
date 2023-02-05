package homework_5.garik_gharibyan.pizza;

public class Order {
    private static int lastOrderNumber = 10000;
    private final int orderNumber;
    private final int quantity;
    private final Pizza pizza;
    private final Customer customer;
    private int topElementIngredients = -1;
    private Ingredient[] ingredients = new Ingredient[0];


    private Order(Pizza pizza, int quantity, Customer customer, int orderNumber) {
        if (quantity >= 10) {
            this.quantity = 10;
        } else if (quantity <= 1) {
            this.quantity = 1;
        } else {
            this.quantity = quantity;
        }
        this.pizza = pizza;
        this.customer = customer;
        this.orderNumber = orderNumber;
    }

    public void addIngredient(Ingredient ingredient) {

        boolean b = isExistIngredient(ingredient);
        if (b == true) {
            System.out.println(ingredient.getName() + " ingredient already exist");
            return;
        }

        if (ingredients.length > 6) {
            System.out.println(pizza.getName() + " pizza ingredient are full");
        } else if (ingredients.length == 0) {
            extendCapacityIngredient();
            ingredients[++topElementIngredients] = ingredient;
        } else {
            extendCapacityIngredient();
            ingredients[++topElementIngredients] = ingredient;
        }
    }

    private void extendCapacityIngredient() {
        Ingredient[] newArrayIngredients = new Ingredient[ingredients.length + 1];
        for (int i = 0; i < ingredients.length; i++) {
            newArrayIngredients[i] = ingredients[i];
        }
        ingredients = newArrayIngredients;
    }

    boolean isExistIngredient(Ingredient ingredient) {
        for (Ingredient i : ingredients) {
            if (i.getName().equals(ingredient.getName())) {
                return true;
            }
        }
        return false;
    }

    public int getQuantity() {
        return quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Pizza getPizza() {
        return pizza;
    }


    public void getInfo() {
        System.out.println(
                "order: " + orderNumber + "\n" +
                        "customer phone number: " + customer.getPhoneNumber() + "\n" +
                        "customer name: " + customer.getName() + "\n" +
                        "quantity: " + quantity + "\n"
        );
    }

    public static Order makeOrder(Pizza pizza, int quantity, Customer customer){
        return new Order(pizza,quantity,customer,lastOrderNumber++);
    }
}
