package homework_21.Nona_Asatryan;


import homework_21.Nona_Asatryan.sorting_algorithms.BubbleSort;
import homework_21.Nona_Asatryan.sorting_algorithms.MergeSort;
import homework_21.Nona_Asatryan.sorting_algorithms.QuickSort;
import homework_21.Nona_Asatryan.sorting_algorithms.SelectionSort;

import java.util.Arrays;

public class CalculateSortVelocity {
    public static void main(String[] args) {
        CalculateSortVelocity sortVelocity=new CalculateSortVelocity();
        sortVelocity.executeSorting(5,4);

    }
    public void executeSorting(int length, int attempts) {

        int[] list = RandomList.randomInteger(length);

        BubbleSort bubbleSort=new BubbleSort(list,attempts);
        QuickSort quickSort=new QuickSort(list,attempts);
        MergeSort mergeSort=new MergeSort(list,attempts);
        SelectionSort selectionSort=new SelectionSort(list,attempts);

        Thread t1=new Thread(bubbleSort);
        Thread t2=new Thread(quickSort);
        Thread t3=new Thread(mergeSort);
        Thread t4=new Thread(selectionSort);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Array length - " + Arrays.toString(list) + "  " + attempts);
        System.out.println();

        System.out.print("               |");
        for (int i = 0; i < attempts; i++) {
            System.out.printf("  run %-4s|", (i + 1));
        }
        System.out.print("    max    |    min    |    avg    |    medium    \n");

        bubbleSort.print("bubbleSort");
        quickSort.print("quickSort");
        mergeSort.print("mergeSort");
        selectionSort.print("selectionSort");
    }
}
