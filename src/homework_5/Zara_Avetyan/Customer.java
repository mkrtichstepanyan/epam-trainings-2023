package homework_5.Zara_Avetyan;

import java.util.Random;
import java.util.Scanner;

public class Customer {
    private static String customerName;

    public int customerNumber() {
        return new Random().nextInt(99999 - 10000) + 10000;
    }

    public String customerName() {
        System.out.print("Please write customer name: ");
        customerName = new Scanner(System.in).next();
        return customerName;
    }

    public static String getCustomerName() {
        return customerName;
    }
}
