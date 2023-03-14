package homework_7.Sofya_Ghazaryan.Pizza.interfaces;

import homework_7.Sofya_Ghazaryan.Pizza.model.Ingredient;
import homework_7.Sofya_Ghazaryan.Pizza.model.Product;
import homework_7.Sofya_Ghazaryan.Pizza.model.ProductType;

public interface OrderInter {


    public void addProduct(String productName, ProductType productType,
                           Ingredient[] ingredients, int quantity);

    public void addDrink(Product drink, int quantity);


    public double calculateOrderPrice();
}
