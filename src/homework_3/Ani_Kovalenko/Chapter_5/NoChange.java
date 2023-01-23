package homework_3.Ani_Kovalenko.Chapter_5;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class NoChange {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 2;
        }
        System.out.println();

        for(int x: nums){
            System.out.print(x + " ");
        }
    }
}
