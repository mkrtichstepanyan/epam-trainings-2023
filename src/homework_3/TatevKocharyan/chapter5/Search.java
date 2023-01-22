package homework_3.TatevKocharyan.chapter5;

public class Search {
    public static void main(String[] args) {
        int[] nums = {6, 8, 3, 4, 8, 5, 1, 2};
        int val = 5;
        boolean found = false;
        for (int x : nums) {
            if (x == 5) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Value found!");
        }
    }
}