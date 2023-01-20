package homework_3.Varsik_Pijoyan.chapter_5;

public class Search {
    public static void main(String[] args) {
        int[] nums = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;
        //using for-each style for to search nums for val
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Value found! ");
        }
    }
}
