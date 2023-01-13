package Hovhannes_Gspeyan;

/**
 * This class demonstrates
 * the average of an array
 */
public class Average {
    public static void main(String[] args) {
        double[]nums = {10.1,11.2,12.3,13.4,14.5};
        double result = 0;
        for (int i = 0; i < 5; i++) {
            result += nums[i];
        }
        System.out.println("Average is = " + result / 5);
    }
}
