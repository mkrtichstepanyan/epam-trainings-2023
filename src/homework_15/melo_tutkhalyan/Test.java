package homework_15.melo_tutkhalyan;

import java.util.Arrays;

import static homework_15.melo_tutkhalyan.BubbleSort.bubbleSort;

public class Test {
  public static void main(String[] args) {
      int[] arr = {2, 7, 5, 8, 4, 1, 9, 6, 3, 0};
      bubbleSort(arr);
      System.out.println(Arrays.toString(arr));

    }
}
