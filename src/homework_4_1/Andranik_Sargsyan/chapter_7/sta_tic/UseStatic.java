package homework_4_1.Andranik_Sargsyan.chapter_7.sta_tic;

public class UseStatic {
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x= " + x);
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }

    static {
        System.out.println("Static block is init!");
        b = a * 4;
    }

    public static void main(String[] args) {
        meth(42);
    }
}
