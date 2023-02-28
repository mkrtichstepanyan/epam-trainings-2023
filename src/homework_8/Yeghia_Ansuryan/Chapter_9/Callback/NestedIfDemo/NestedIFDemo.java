package homework_8.Yeghia_Ansuryan.Chapter_9.Callback.NestedIfDemo;

import homework_8.Yeghia_Ansuryan.Chapter_9.Callback.NestedIfDemo.A;
import homework_8.Yeghia_Ansuryan.Chapter_9.Callback.NestedIfDemo.B;

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedF nif = new B();
        if (nif.isNotNegative(10)) {
            System.out.println("10 is not negative");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("this won`t be displayed");
        }
    }
}
