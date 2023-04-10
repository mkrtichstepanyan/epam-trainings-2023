package homework_5.Ani_Kovalenko.Pizza_With_System.in;

public class Run {
    public static void main(String[] args) {

        Customer customer = new Customer("poxos");

        Order order = new Order(customer);

        Pizza pizza1 = new Pizza("regular", "Margarita", 11);
        order.addPizza(pizza1);
        pizza1.addIngredient();

        order.nextPizzaCall();
        Pizza pizza2 = new Pizza("regular", "Tashir", 6);
        order.addPizza(pizza2);
        pizza2.addIngredient();

        order.nextPizzaCall();
        Pizza pizza3 = new Pizza("closed", "Pepperoni", 1);
        order.addPizza(pizza3);
        pizza3.addIngredient();

        order.nextPizzaCall();
        Pizza pizza4 = new Pizza("closed", "Nur", 1);
        order.addPizza(pizza4);
        pizza4.addIngredient();

        order.nextPizzaCall();
        Pizza pizza5 = new Pizza("closed", "Nur", 1);
        order.addPizza(pizza5);
        pizza5.addIngredient();

        order.nextPizzaCall();
        Pizza pizza6 = new Pizza("closed", "Nur", 1);
        order.addPizza(pizza6);
        pizza6.addIngredient();

        order.nextPizzaCall();
        Pizza pizza7 = new Pizza("closed", "Nur", 1);
        order.addPizza(pizza7);
        pizza7.addIngredient();

        order.nextPizzaCall();
        Pizza pizza8 = new Pizza("closed", "Nur", 1);
        order.addPizza(pizza8);
        pizza8.addIngredient();

        order.nextPizzaCall();
        Pizza pizza9 = new Pizza("closed", "Nur", 1);
        order.addPizza(pizza9);
        pizza9.addIngredient();

        order.nextPizzaCall();
        Pizza pizza10 = new Pizza("closed", "Nur", 1);
        order.addPizza(pizza10);
        pizza10.addIngredient();

        order.nextPizzaCall();
        Pizza pizza11 = new Pizza("closed", "Nur", 1);
        order.addPizza(pizza11);
        pizza11.addIngredient();


        CheckPrinter.printCheck(order);

    }

}
