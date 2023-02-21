package homework_3.shushanik_araqelyan.Chapter_5;

public class NoChanges {
public static void main(String [] args){
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for(int x: nums) {
        System.out.println(x + " ");
        x = x * 10; //no effect on nums
    }
    System.out.println();
    for(int x : nums)
        System.out.println(x + " ");
    System.out.println();
    }
}
