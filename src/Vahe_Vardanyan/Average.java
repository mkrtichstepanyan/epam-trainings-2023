package Vahe_Vardanyan;

public class Average {
    public static void main(String[] args) {
        double[] nums = {10.1, 11.2, 12.3
                , 13.4, 14.5};
        System.out.println("13/");

        double result1 = 0;
        int i2;
        for (i2 = 0; i2 < 5; i2++) {
            result1 = result1 + nums[i2];
            System.out.println(" Average value " + result1 / 5);
        }

    }
}
