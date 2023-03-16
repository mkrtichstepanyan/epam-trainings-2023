package homework_11.Yeghia_Ansuryan.chapter_13.staticImport;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Hypot2 {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;

        side1 = 3.0;
        side2 = 4.0;
        hypot = sqrt(pow(side1, 2) + pow(side2, 2));
        System.out.println("Given sides of lengths " +
                side1 + " and " + side2 +
                " the hypotenuse is " +
                hypot);
    }
}
