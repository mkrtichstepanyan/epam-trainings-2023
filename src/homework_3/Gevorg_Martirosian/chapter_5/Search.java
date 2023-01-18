package Gevorg_Martirosian.chapter_5;

//search in array with using for-each loop
public class Search {
    public static void main(String[] args) {
        int[] nums = {6, 8, 3, 7, 5, 6, 1, 4};
        int value = 5;
        boolean found = false;

        //using for-each loop for searching the value in nums
        for (int x : nums) {
            if (x == value){
                found = true;
                break;
            }
        }

        if (found){
            System.out.println("the value is found");
        }
    }
}
