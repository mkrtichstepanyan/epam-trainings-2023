package Diana_Melkonyan;

public class Average {
    public static void main(String[] args) {
        double[] nums = new double[]{10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0.0;

        for(int i = 0; i < 5; ++i) {
            result += nums[i];
        }

        System.out.println("Average is " + result / 5.0);
    }
}
