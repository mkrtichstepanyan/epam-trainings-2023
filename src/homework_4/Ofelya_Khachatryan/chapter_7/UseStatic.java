package homework_4.Ofelya_Khachatryan.chapter_7;

public class UseStatic {
    static int a = 3;
    static int b;

    public static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }

    public static void main(String[] args) {
        meth(42);
    }
}
