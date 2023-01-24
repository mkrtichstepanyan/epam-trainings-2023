package homework_3.Anna_Manukyan.chapter_5;

//Search in array using for-each loop
public class Search {
    public static void main(String[] args) {
        int[] nums = {6, 8, 3, 7, 5, 6, 1, 3};
        int val = 5;
        boolean found = false;

        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Value found!");
        }

    }
}
