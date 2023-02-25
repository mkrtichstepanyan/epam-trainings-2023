package homework_9.Lilit_Adamyan.pizza;


public class Drink extends Product {
    private boolean isAlcoholic;

    public Drink(String name, double price, int quantity, boolean isAlcoholic) {
        super(name, price, quantity);
        this.isAlcoholic = isAlcoholic;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }
}
