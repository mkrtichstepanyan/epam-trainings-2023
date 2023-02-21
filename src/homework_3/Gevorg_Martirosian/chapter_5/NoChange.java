package homework_3.Gevorg_Martirosian.chapter_5;

//variable of the iteration in for-each loop is only for reading
public class NoChange {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 10; //no changes for nums
        }
        System.out.println();

        for (int x : nums) {
            System.out.print(x + " ");
        }
    }
}
