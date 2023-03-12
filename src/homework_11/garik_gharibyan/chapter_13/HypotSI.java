package homework_11.garik_gharibyan.chapter_13;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class HypotSI {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;

        side1 = 3;
        side2 = 4;

        hypot = sqrt(pow(side1, 2) + pow(side2, 2));
        System.out.println("Given sides of length " + side1 + " end " + side2 + " the hypotenuse is " + hypot);
    }
}
