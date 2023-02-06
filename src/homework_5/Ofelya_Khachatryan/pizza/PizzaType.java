package homework_5.Ofelya_Khachatryan.pizza;

public class PizzaType {

    private String name;
    private double price;

    public PizzaType(String name) {
        if(name.equals("closed")){
            this.price = 0.5;
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
