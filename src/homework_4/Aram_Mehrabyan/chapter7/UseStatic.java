package homework_4.Aram_Mehrabyan.chapter7;

public class UseStatic {
    static int a=3;
    static int b;
    static void meth(int x){
        System.out.println("X= "+x);
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
    static {
        b=a*4;
    }

    public static void main(String[] args) {
        b=b+3;
        meth(42);

    }
}
