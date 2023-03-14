package homework_10.Liana_Gevorgyan.Pizza;

public class Drink extends Product {

    double brandPrice = 0;

    Drink(String name, DrinkType type, double brandPrice, int quantity) {
        this.name = name;
        this.type =type;
        this.brandPrice = brandPrice;
        this.quantity = quantity;
    }

    @Override
    public double calculatePrice() {
        return (this.type.getPrice() + brandPrice);
    }

    @Override
    public void validateAndCorrectName(Order order) {
        System.out.println("No rules defined for drinks");
    }

    @Override
    public String getPrintableString() {
        return type.name + " " + name + " " + calculatePrice() + "$";
    }
}
