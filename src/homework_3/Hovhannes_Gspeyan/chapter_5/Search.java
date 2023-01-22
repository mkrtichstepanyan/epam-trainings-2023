package homework_3.Hovhannes_Gspeyan.chapter_5;

/**
 * This program searches an
 * array using for - each style for
 */
public class Search {
    public static void main(String[] args) {
        int[] nums = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        for (int x : nums) {
            if(x == val){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Value found! ");
        }
    }
}
