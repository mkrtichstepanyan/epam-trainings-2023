package homework_1.Galust_Arzumanyan;


// This method is used to calculate average of array values
class Average {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5};
        int result = 0;
        int i;
        for (i = 0; i < 4; i++) {
            result = result + nums[i];
        }
        System.out.println("Average is " + result / 4);
    }
}