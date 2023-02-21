package homework_7.Radik_Manasyan.orders;

import homework_7.Radik_Manasyan.products.IceCream;
import homework_7.Radik_Manasyan.products.productType.ProductType;

public class OrderIceCream extends Order {

    public OrderIceCream() {
        setOrderNumber(getInitialId() + 1);
        setInitialId(getOrderNumber());
    }

    public void add(String iceCreamName, ProductType type, int quantity) {

        int iceCream = getIndex();
        setIndex(iceCream++);

        IceCream ice = new IceCream(iceCreamName, type, quantity);
        addOrderByProducts(ice);

    }

    @Override
    public double calculateOrderPrice() {
        double totalCoast = 0.0;
        for (int i = 0; i < getIndex(); i++) {
            totalCoast += products[i].calculatePrice() * products[i].getQuantity();

        }
        return totalCoast;
    }
}
