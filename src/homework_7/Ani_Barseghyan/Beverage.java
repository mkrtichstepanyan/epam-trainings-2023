package homework_7.Ani_Barseghyan;

public class Beverage extends Product {

    Beverage(String name, ProductType productType, int quantity) {
        super(name, productType, quantity);
    }

    public double calculatePrice() {
        return super.getProductType().getPrice();
    }

    public ProductType getProductType() {
        return super.getProductType();
    }
}
