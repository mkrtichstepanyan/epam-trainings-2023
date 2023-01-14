package homework_1.radik_manasyan;

public class BoolTest {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println("b = " + b);
        b = true;
        System.out.println("b = " + b);
        if (b) {
            System.out.println("This code works");
            b = false;

        }
        if (b){
            System.out.println("This code doesn't work");
        }
        System.out.println("10 > 9 ? answer -->" + (10 > 9));
    }
}
