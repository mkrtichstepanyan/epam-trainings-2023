package homework_10.Ani_Kovalenko.Pizza_Exceptions;

public enum BurgerBreadType implements Basic {
    BLACK_BREAD("Black Bread", 0.5), WHITE_BREAD("White Bread", 0.3);
    private String name;
    private double price;

    BurgerBreadType(String name, double price) {
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
