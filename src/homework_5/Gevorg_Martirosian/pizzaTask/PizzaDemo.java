package homework_5.Gevorg_Martirosian.pizzaTask;

public class PizzaDemo {
    public static void main(String[] args) {
        //first order
        Pizza firstPizza = new Pizza("Margarita", 2, "calzone");
        Pizza secondPizza = new Pizza("PepperoniOro", 3, "base");
        PizzaOrder myFirstOrder = new PizzaOrder("Antonio", firstPizza, secondPizza);
        myFirstOrder.printCheck();
        //second order
        Pizza thirdPizza = new Pizza("BasePZZ", 12, "base",true,true,false,true,false,false,true,true);
        PizzaOrder mySecondOrder = new PizzaOrder("Adriano", thirdPizza);
        mySecondOrder.printCheck();
    }
}
