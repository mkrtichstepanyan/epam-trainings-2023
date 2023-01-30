package homework_4.Alina_Vardanovna.chapter7;

public class Block {

    private int a;

    {
        if (4 > 9) {
            a = 7;
        } else {
            a = 10;
        }
    }

    Block() {
        System.out.println(a);
    }

    public int getA() {
        return a;
    }

}
