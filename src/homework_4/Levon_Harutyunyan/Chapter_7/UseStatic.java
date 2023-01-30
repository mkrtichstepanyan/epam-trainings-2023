package homework_4.Levon_Harutyunyan.Chapter_7;

public class UseStatic {
    static int a = 3;
    static int b;

    static int a1 = 42;
    static int b1 = 99;

    static void callme(){
        System.out.println("a1 = " + a1);
    }

    static void meth(int x) {
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
        System.out.println();

        UseStatic.callme();
        System.out.println("b1 = " + UseStatic.b1);
    }
}
