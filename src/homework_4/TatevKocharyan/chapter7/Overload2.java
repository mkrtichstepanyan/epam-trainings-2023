package homework_4.TatevKocharyan.chapter7;

public class Overload2 {
    public static void main(String[] args) {
        OverloadDemo2 ob = new OverloadDemo2();
        int i = 88;
        ob.test();
        ob.test(10, 20);
        ob.test(123.5);
        ob.test(i);
    }
}