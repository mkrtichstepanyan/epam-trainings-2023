package homework_15.Sofya_Ghazaryan;

import static homework_15.Sofya_Ghazaryan.BubbleSort.bubbleSort;
import static homework_15.Sofya_Ghazaryan.InsertionSort.insertionSort;
import static homework_15.Sofya_Ghazaryan.MergeSort.mergeSort;
import static homework_15.Sofya_Ghazaryan.SelectionSort.printArray;
import static homework_15.Sofya_Ghazaryan.SelectionSort.selectionSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 9, 0, -1, 10, -6, 7};
        int[] array1 = {-6, 2, 15, 7};


        System.out.println("Bubble Sort");
        bubbleSort(array);
        printArray(array);

        System.out.println();

        System.out.println("Selection Sort");
        selectionSort(array1);
        printArray(array1);

        System.out.println();

        System.out.println("Insertion Sort");
        insertionSort(array);
        printArray(array);

        System.out.println();

        System.out.println("Insertion Sort(array1)");
        insertionSort(array1);
        printArray(array1);

        System.out.println();

        System.out.println("Merge Sort(array)");
        mergeSort(array, 0, array.length - 1);
        printArray(array);
    }
}
