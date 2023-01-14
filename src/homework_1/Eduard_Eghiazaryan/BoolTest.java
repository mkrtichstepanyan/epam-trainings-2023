package homework_1.Eduard_Eghiazaryan;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.printf("b equals " + b);
        b = true;
        System.out.printf("b equals " + b);

        if (b) System.out.printf("this is being done");

        b = false;
        if (b) System.out.printf("this isn't being done.");
        System.out.printf("10>9 equal " + (10 > 9));
    }
}
