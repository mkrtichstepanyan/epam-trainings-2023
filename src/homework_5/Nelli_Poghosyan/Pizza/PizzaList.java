package homework_5.Nelli_Poghosyan.Pizza;

public class PizzaList {
    private Pizza[] pizzaList;
    private static final int SIZE = 10;
    private  int top = -1;

    public PizzaList(int pizzaCount){
        pizzaList = new  Pizza[pizzaCount];
    }
    public void addPizza(Pizza pizza){
        if(top == SIZE-1){
            System.out.println("You can't order anymore.");
        }else {
            pizzaList[++top] = pizza;
        }
    }
    public Pizza[] getPizza(){
        if (top < 0) {
            System.out.println("No pizzas added");
            return null;
        } else {
            return pizzaList;
        }
    }

}
