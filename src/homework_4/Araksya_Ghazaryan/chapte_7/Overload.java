package homework_4.Araksya_Ghazaryan.chapte_7;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(135.25);
        System.out.println(" Result ob.test " +  result);
    }
}
