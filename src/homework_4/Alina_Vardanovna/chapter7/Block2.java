package homework_4.Alina_Vardanovna.chapter7;

public class Block2 {

    private final int a;
    static int b = 19;

    static {
        System.out.println("I'm static block.");
        System.out.println(b);
    }

    Block2() {
        a = 8;
    }

    Block2(int x) {
        a = x;
    }

    public int getA() {
        System.out.println(b);
        return a;
    }

}
