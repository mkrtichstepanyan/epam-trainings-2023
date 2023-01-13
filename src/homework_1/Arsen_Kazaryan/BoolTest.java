package homework_1.Arsen_Kazaryan;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b equal " + b);
        b = true;
        System.out.println("b equal " + b);

        if (b) System.out.println("This is executed.");

        b = false;
        if (b) System.out.println("This is executed.");

        System.out.println("10 > 9 equal " + (10 > 9) );
    }

}
