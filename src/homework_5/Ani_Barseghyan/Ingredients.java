package homework_5.Ani_Barseghyan;

public class Ingredients {
    private String toppingName;
    private double toppingCost;

    Ingredients(String toppingName, double toppingCost) {
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;
    }

    public String getToppingName() {
        return toppingName;
    }

    public double getToppingCost() {
        return toppingCost;
    }

    public static Ingredients tomatoPaste() {
        return new Ingredients("Tomato paste", 1);
    }

    public static Ingredients cheese() {
        return new Ingredients("Cheese", 1);
    }

    public static Ingredients salami() {
        return new Ingredients("Salami", 1.5);
    }

    public static Ingredients bacon() {
        return new Ingredients("Bacon", 1.2);
    }

    public static Ingredients garlic() {
        return new Ingredients("Garlic", 0.3);
    }

    public static Ingredients corn() {
        return new Ingredients("Corn", 0.7);
    }

    public static Ingredients pepperoni() {
        return new Ingredients("Pepperoni", 0.6);
    }

    public static Ingredients olives() {
        return new Ingredients("Olives", 0.5);
    }

}
