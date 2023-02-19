package homework_7.Lilit_Adamyan;


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
