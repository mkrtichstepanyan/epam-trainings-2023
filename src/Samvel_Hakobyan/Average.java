package Samvel_Hakobyan;

public class Average {
    public static void main(String[] args) {
        double[] nums = {10.1,11.2,12.3,13.4,14.5};
        double result1 = 0;
        int i;
        for (i = 0; i < 5 ; i++) {
            result1 = result1 + nums[i];
            System.out.println(" Average value " + result1/5);
        }
    }
}
