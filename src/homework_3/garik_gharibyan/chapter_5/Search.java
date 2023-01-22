package homework_3.garik_gharibyan.chapter_5;

public class Search {
    public static void main(String[] args) {

        boolean found = false;
        int[] nums = {6, 8, 3, 7, 5, 6, 1, 4};
        int var = 5;

        for (int i : nums) {
            if (i == var) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("ka");
        }
    }
}
