package homework_1.Hovhannes_Gspeyan;

/**
 * This class demonstrates block scope
 */
public class Scope {

    public static void main(String[] args) {

        int x;

        x = 10;
        if(x == 10){
            int y = 20;
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100 error! y not visible here

        // inverse of y x is visible here
        System.out.println("x is: " + x);
    }
}
