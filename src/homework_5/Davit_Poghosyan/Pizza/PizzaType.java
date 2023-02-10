package homework_5.Davit_Poghosyan.Pizza;

public class PizzaType {
    private static final String regular = "Regular";
    private static final String closed = "Calsone";
    private double price;

    public double getPizzaBasePrice(String base) {
        switch (base) {
            case "Regular":
                price = 1.0;
                break;
            case "Calsone":
                price = 1.5;
                break;
        }
        return price;
    }

    public static String getRegular() {
        return regular;
    }
    public static String getClosed() {
        return closed;
    }

    public PizzaType() {
    }

}
