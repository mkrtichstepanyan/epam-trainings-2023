package homework_1.Gohar_Hakobyan;

public class BoolTest {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println("boolean b equals " + b);

        b = true;
        System.out.println("boolean b equals  " + b);

        if (b) {
            System.out.println("The code is execute");

            b = false;
            System.out.println("The code doesn't execute");
            System.out.println("10 > 9 equals  " + (10 > 9));
        }
    }
}