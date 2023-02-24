package homework_5.Zara_Avetyan;

import java.util.Random;
import java.util.Scanner;

public class Order {
    public static int orderNumber() {
        return new Random().nextInt(99999 - 10000) + 10000;
    }

    public String orderName() {
        System.out.print("Please write name for pizza: ");
        return new Scanner(System.in).next();
    }
}
