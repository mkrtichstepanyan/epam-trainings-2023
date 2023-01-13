package homework_1.Armen_Martirosyan;

public class BooleanTest {
    public static void main(String[] args) {
        boolean b = false;

        System.out.println("b is " + b);

        b = true;

        System.out.println("b is " + b);
        if (b = false) {
            System.out.println("This is not executed.");
        } else {
            b = true;
            {
                System.out.println("This is executed. ");
            }
        }
        System.out.println("10>9 is " + (10 > 9));
    }
}
