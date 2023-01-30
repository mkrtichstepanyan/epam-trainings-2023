package homework_4.Anna_Manukyan.chapter_7;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        OverloadDemo1 ob1 = new OverloadDemo1();
        double result;
        int i = 88;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(12.235);
        System.out.println("Result of ob.test(12.235) is " + result);

        ob1.test();
        ob1.test(i);
        ob1.test(10, 20);
    }

}
