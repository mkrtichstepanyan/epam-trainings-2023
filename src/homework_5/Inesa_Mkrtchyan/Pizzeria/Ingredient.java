package homework_5.Inesa_Mkrtchyan.Pizzeria;

public class Ingredient {
    public String name;
    public double quantity;

    public Ingredient(String name, double price) {
        this.name = name;
        this.quantity = price;
    }

    public void printIngredient() {
        System.out.println(name + " - " + quantity);
    }

}
