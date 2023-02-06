package homework_5.Ani_Kovalenko.Pizza_Homework_2;

public class Pizza {
//
    private  int id;
    private double price;
    String pizzaName;

    public Pizza(String type, String pizzaName, int pizzaCount,int id) {
        if(pizzaCount > 10){
            System.out.println("More than 10 items are not allowed to order");
            return;
        }
        if (type.equals("closed")) {
            price = 1.50;
        }
        price = 1.0;
        this.id=id;
        this.pizzaName=pizzaName;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
