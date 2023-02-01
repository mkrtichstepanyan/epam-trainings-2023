package homework_5.Robert_Nazaryan.pizza;

public class Pizza {
    private String[] pizza;
    private double[] price;
    private int indexPizza, indexPrice;

    public Pizza() {
        indexPizza = -1;
        indexPrice = -1;
        pizza = new String[8];
        price = new double[8];
    }

    public void push(String item) {
        pizza[++indexPizza] = item;
    }
    public void push(double p) {
        price[++indexPrice] = p;
    }

    public String popIngredient() {
        return pizza[indexPizza--];
    }
    public double popPrice() {
        return price[indexPrice--];
    }


    public int getIndex() {
        return indexPizza;
    }
}
