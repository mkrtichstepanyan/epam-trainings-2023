package homework_5.garik_gharibyan.pizza;

public class Pizza {

    private String name;
    private PizzaType pizzaType;


    public Pizza(String name, PizzaType pizzaType) {
        if (name.length()<4 ||name.length()>20){
            this.name = "cunsomername";
        }else {
            this.name = name;

        }
        this.pizzaType = pizzaType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

}
