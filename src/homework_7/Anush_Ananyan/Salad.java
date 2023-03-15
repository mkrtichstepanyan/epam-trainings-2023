package homework_7.Anush_Ananyan;

public class Salad extends Product {


    public Salad(String name, ProductType productType, int quantity) {
        super(name, productType, quantity);
    }

    @Override
    public double calculatePrice() {
        return getProductType().getPrice();
    }
}
