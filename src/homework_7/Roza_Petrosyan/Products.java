package homework_7.Roza_Petrosyan;

public abstract class Products {
    private Pizza[] pizzas = new Pizza[10];
    private Drink[] drinks = new Drink[10];

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public Drink[] getDrinks() {
        return drinks;
    }
}
