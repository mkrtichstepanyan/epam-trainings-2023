package homework_7.Ani_Barseghyan;

public class BeverageType extends ProductType {
    private String type = "drink";
    public static final BeverageType ALCOHOLIC = new BeverageType("Alcoholic", 3.0);
    public static final BeverageType NON_ALCOHOLIC = new BeverageType("Non Alcoholic", 2.5);

    public BeverageType(String name, double price) {
        super(name, price);
    }

    public String getType() {
        return type;
    }
}
