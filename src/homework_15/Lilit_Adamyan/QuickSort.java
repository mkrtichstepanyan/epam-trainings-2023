package homework_15.Lilit_Adamyan;

public class QuickSort {
    public static void main(String[] args) {

        int[] array = {52, 14, 68, 23, 1, 74, 8, 25, 19, 63};
        System.out.println("Before quickSort: ");
        printArray(array);
        System.out.println("After quickSort: ");
        printArray(quickSort(array,0,array.length-1));


    }

    private static int[] quickSort(int[] array, int lowIndex, int highIndex) {
        //if we have only one element
        if (lowIndex >= highIndex) {
            return array;
        }
        //choose the pivot,here we take the last element
        int pivot = array[highIndex];

        //declare the pointers
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        //create a loop that will move leftPointer and rightPointer towards each other until they hit each other
        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            //swap elements from leftPointer and rightPointer
            swap(array, leftPointer, rightPointer);
        }
        //swap with pivot
        swap(array, leftPointer, highIndex);

        //to recursively quicksort for the left partition
        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);
        return  array;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
