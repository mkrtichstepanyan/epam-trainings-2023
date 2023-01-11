//demonstration of boolean data types
public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b equals " + b);
        b = true;
        System.out.println("b equals " + b);

        //boolean type value can control an operator if
        if (b) {
            System.out.println("this will be run");
        }
        b = false;
        if (b) {
            System.out.println("this will not be run");
        }

        //the results of compare operations are boolean values
        System.out.println("10 > 9 equals " + (10 > 9));
    }
}
