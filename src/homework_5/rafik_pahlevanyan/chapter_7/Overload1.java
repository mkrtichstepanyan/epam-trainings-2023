package homework_5.rafik_pahlevanyan.chapter_7;

public class Overload1 {
    public static void main(String[] args) {
        OverloadDemo1 ob1 = new OverloadDemo1();
        int i = 88;
        ob1.test();
        ob1.test(10, 20);
        ob1.test(i); //this will invoke test(double)
        ob1.test(123.2);//this will invoke test(double)

    }
}
