package homework_4.Ani_Kovalenko.Chapter_7;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
        double result;

        od.test();
        od.test(10);
        od.test(10, 20);
        result = od.test(123.25);
        System.out.println("Result of ob.test(123.25) is " + result);


        System.out.println("----------------------------------------");
        OverloadDemo od2 = new OverloadDemo();
        int i = 88;

        od2.test();
        od2.test(10,20);

        od2.test2(i);
        od2.test2(123.2);

    }
}
