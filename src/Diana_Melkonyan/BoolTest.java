package Diana_Melkonyan;

public class BoolTest {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println("b is" + b);
        b = true;
        System.out.println("b is" + b);
        System.out.println("This is executed");
        b = false;
        if (b) {
            System.out.println("This is not executed");
        }

        System.out.println("10> 9 istrue");
    }
}
