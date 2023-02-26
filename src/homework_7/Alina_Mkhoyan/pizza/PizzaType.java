package homework_7.Alina_Mkhoyan.pizza;
//
//public class PizzaType {
//    private static final double BASE_PRICE = 1.0;
//
//    public static final PizzaType REGULAR =
//            new PizzaType("Regular", BASE_PRICE, 1);
//    public static final PizzaType CALZONE =
//            new PizzaType("Calzone", BASE_PRICE, 1.5);
//
//    private String name;
//    private double price;
//
//    private double additionalPrice;
//
//    PizzaType(String name, double basePrice, double additionalPrice) {
//        this.name = name;
//        this.price = basePrice + additionalPrice;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getAdditionalPrice() {
//        return additionalPrice;
//    }
//}


public enum PizzaType {

    REGULAR("Regular",1),
    CLOSED("Calzone",1.5);

    private final String name;
    private final double price;

    PizzaType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
