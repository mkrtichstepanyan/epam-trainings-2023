package homework_10.Anush_Ananyan.Pizza.Pizzeria;

public class Salad extends Product {


    public Salad(String name, ProductType productType, int quantity) {
        super(name, productType, quantity);
    }

    @Override
    public double calculatePrice() {
        return getProductType().getPrice();
    }
}
