package homework_5.Ani_Kovalenko.Pizza_Homework_2;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Customer customer1 = new Customer("poxos");
//        Customer customer2 = new Customer("petros");
//        Customer customer3 = new Customer("petros");
//        Customer customer4 = new Customer("petros");
//        System.out.println(customer1.getId());
//        System.out.println(customer2.getId());
//        System.out.println(customer3.getId());
//        System.out.println(customer4.getId());
//
        Order order_1 = new Order(customer1);
//        Order order_2 = new Order(customer1);
//        Order order_3 = new Order(customer1);
//        Order order_4 = new Order(customer3);
//        System.out.println(order_1.getOrderNumber());
//        System.out.println(order_2.getOrderNumber());
//        System.out.println(order_3.getOrderNumber());
//
        Pizza pizza = new Pizza("closed", "hg", 8, 5);



        order_1.chooseType();

    }

}
