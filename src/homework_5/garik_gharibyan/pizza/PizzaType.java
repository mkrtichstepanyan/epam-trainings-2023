package homework_5.garik_gharibyan.pizza;

public class PizzaType {

    private final String pizzaTypeName;
    private final double pizzaTypePrice;

    private PizzaType(String pizzaTypeName, double pizzaTypePrice){
        this.pizzaTypeName = pizzaTypeName;
        this.pizzaTypePrice = pizzaTypePrice;
    }
    static PizzaType regular =  new PizzaType("Regular", 1);
    static PizzaType closed =  new PizzaType("Closed", 1.5);

    public String getPizzaTypeName() {
        return pizzaTypeName;
    }

    public double getPizzaTypePrice() {
        return pizzaTypePrice;
    }
}
