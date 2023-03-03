package homework_8.homework_8_liana_gevorgyan.Pizza;

public abstract class Product {

    protected String name;
    protected ProductType type;
    protected int quantity;


    public abstract double calculatePrice();

    public abstract void validateAndCorrectName(Order order);

    public abstract String getPrintableString();

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getType() {
        return type.getName();
    }

}
