package homework_4.gevorg_arghushyan.chapter_7;

public class UseStatic {
    static int a = 3;
    static  int b;
    static void meth(int x){
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static {
        System.out.println("Initialization in a static block.");
        b = a * 4;
    }

    public static void main(String[] args) {
        meth(42);
    }
}
