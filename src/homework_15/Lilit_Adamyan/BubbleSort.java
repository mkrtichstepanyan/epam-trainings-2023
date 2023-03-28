package homework_15.Lilit_Adamyan;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {25, 11, 86, 41, 1, 29, 17, 64};
        System.out.print("Before bubbleSort: ");
        printArray( array);
        System.out.print("After bubbleSort: ");
        printArray(bubbleSort(array));
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
              swap(array,j);
            }
        }
        return  array;
    }

    public static void swap(int[] array, int index) {
        if (array[index] > array[index + 1]) {
            int temp = array[index];
            array[index] = array[index + 1];
            array[index + 1] = temp;
        }
    }

}
