package homework_15.TatevKocharyan;

public class SortingTest {
    public static void main(String[] args) {

        int[] array = {45, 6, 7, 55, 95, 1, 8, 4};
        BubbleSort.bubbleSort(array);
  //      print(array);
 //       SelectionSort.selectionSort(array);
 //       print(array);
 //       InsertionSort.insertionSort(array);
        print(array);
    }


    public static void print(int[] array) {
        System.out.println("\nSortig algorithm");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
