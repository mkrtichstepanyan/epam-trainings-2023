package Vladimir_Vanyan;

public class Average {
    public static void main(String[] args) {
        double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5};
        double resault = 0;
        int i;
        for (i = 0; i < 5; i++) {
            resault = resault + nums[i];
        }
        System.out.println("Argishti_Mesropyan.Average is " + resault / 5);
    }
}
