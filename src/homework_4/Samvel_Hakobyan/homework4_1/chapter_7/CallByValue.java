package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

import java.security.spec.RSAOtherPrimeInfo;

public class CallByValue {
    public static void main(String[] args) {
        Test2 ob = new Test2();

        int a = 15, b = 20;
        System.out.println("a and b before call: " + a + " " + b);

        ob.meth(a,b);
        System.out.println("a and b before call: " + a + " " + b);
    }
}
