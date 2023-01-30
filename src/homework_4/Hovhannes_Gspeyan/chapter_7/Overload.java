package homework_4.Hovhannes_Gspeyan.chapter_7;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
        OverloadDemo2 ob = new OverloadDemo2();
        double result;
        int i = 88;

        od.test();
        od.test(10);
        od.test(10,20);
        result = od.test(123.25);
        System.out.println("result of od.test(123.25): " + result);

        ob.test();
        ob.test(10,20);

        ob.test(i);
        ob.test(123.2);
    }
}
