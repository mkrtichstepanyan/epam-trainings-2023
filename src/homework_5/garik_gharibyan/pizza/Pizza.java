package homework_5.garik_gharibyan.pizza;

public class Pizza {

    private final String name;
    private final PizzaType pizzaType;
    private final int quantity;
    private int topElementIngredients = -1;
    private Ingredient[] ingredients = new Ingredient[0];
    private final Customer customer;


    public Pizza(String name, int quantity, PizzaType pizzaType, Customer customer) {
        this.customer = customer;
        if (name.length()<4 ||name.length()>20){
            this.name = customer.getName() + "_" + customer.getNumber();
        }else {
            this.name = name;
        }
        if (quantity >= 10) {
            this.quantity = 10;
            System.out.println("We can make maximum 10 pizza");
        } else if (quantity <= 1) {
            this.quantity = 1;
            System.out.println("As you want lass then 1 we will make 1 pizza");
        } else {
            this.quantity = quantity;
        }
        this.pizzaType = pizzaType;
    }
    public String getName() {
        return name;
    }
    public PizzaType getPizzaType() {
        return pizzaType;
    }



    public void addIngredient(Ingredient ingredient) {

        boolean b = isExistIngredient(ingredient);
        if (b == true) {
            System.out.println(ingredient.getName() + " ingredient already exist");
            return;
        }

        if (ingredients.length > 6) {
            System.out.println(name + " pizza ingredient are full");
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

    private boolean isExistIngredient(Ingredient ingredient) {
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

    public void printIngredients() {
        for (Ingredient i : ingredients) {
            System.out.println(i.getName() + " " + i.getPrice());
        }
    }

    public double pizzaAmount() {
        double sum = pizzaType.getPizzaTypePrice();
        for (Ingredient i : ingredients) {
            sum = i.getPrice() + sum;
        }
        return sum;
    }

}
