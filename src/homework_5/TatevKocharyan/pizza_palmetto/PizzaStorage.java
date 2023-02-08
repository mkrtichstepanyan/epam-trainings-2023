package homework_5.TatevKocharyan.pizza_palmetto;

public class PizzaStorage {
    Pizza[] pizzas=new Pizza[10];

    public void addOrder(Pizza pizza) {
        for (int i = 0; i <pizzas.length ; i++) {
            pizzas[i]=pizza;
            break;
        }
    }

    void print(){
        for (int i = 0; i <pizzas.length ; i++) {
            System.out.println(pizzas[i]+" ");
        }
    }
}
