package homework_5.Inesa_Mkrtchyan.Pizzeria;


//import static homework_5.Inesa_Mkrtchyan.Pizzeria.OdreringPizza.inp;

import static homework_5.Inesa_Mkrtchyan.Pizzeria.OrderingPizza.inp;

public class Main {
    public static void main(String[] args) {
        System.out.println("Write Customer name");
        OrderingPizza.order.customer.name = inp.next();
        while (true) {
            OrderingPizza.order.orderPizza(OrderingPizza.OrderPizza());
            System.out.println("Do you want to order another pizza? y/n");
            char cont = inp.next().charAt(0);
            if (cont == 'n') break;
        }

        OrderingPizza.order.PrintOrderInfo();
        OrderingPizza.order.printCountOfPizza();
    }
}
