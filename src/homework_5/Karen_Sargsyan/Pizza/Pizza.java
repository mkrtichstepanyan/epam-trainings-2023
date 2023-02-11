package homework_5.Karen_Sargsyan.Pizza;

public class Pizza {

    private String namePizza;
    private String typeOfPizza;
    private int quantity;

    public Pizza() {

    }

    public void checkPizzaName(int customer, String name, int index) {
        if (name.length() < 4 || name.length() > 20) {
            this.namePizza = name;
            System.out.println(customer + "_" + name + "_" + index);
        } else {
            this.namePizza = name;
            System.out.println(namePizza);
        }
    }

    public String getNamePizza() {
        return namePizza;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTypeOfPizza() {
        return typeOfPizza;
    }

    public void displayingPizzaAttributes(int orderNumber, int customerNumber, String pizzaName, int quantity){
        System.out.println("*********************************************");
        System.out.println("Order: " + orderNumber);
        System.out.println("Customer: " + customerNumber);
        System.out.println("Name: " + pizzaName);
        System.out.println("----------------------------");

        System.out.println("Quantity: " + quantity);
    }

    public void addIngredient(){
        Ingredient.getTomatoPaste();
        Ingredient.getBacon();
        Ingredient.getCheese();
        Ingredient.getOlives();
        Ingredient.getCorn();
        Ingredient.getPepperoni();
        Ingredient.getGarlic();
    }

}
