package homework_4.Radik_Manasyan.homework_4_1.chapter_7;

public class Overload1 {
    public static void main(String[] args) {
        OverloadDemo1 ob = new OverloadDemo1();
        int i = 88;
        ob.test();
        ob.test(10, 20);
        ob.test(i);
        ob.test(123.2);
    }
}
