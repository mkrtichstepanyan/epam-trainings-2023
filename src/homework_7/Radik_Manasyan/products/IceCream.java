package homework_7.Radik_Manasyan.products;

import homework_7.Radik_Manasyan.products.productType.ProductType;

public class IceCream extends Products {


    public IceCream(String name, ProductType productType, int quantity) {
        super(name, productType, quantity);
    }

    @Override
    public double calculatePrice() {
        return getProductType().getPrice();
    }

    @Override
    public Ingredient[] getIngredients() {
        return new Ingredient[0];
    }
}
