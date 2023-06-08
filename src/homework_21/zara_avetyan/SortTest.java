package homework_21.zara_avetyan;

import homework_21.zara_avetyan.sort.BubbleSort;
import homework_21.zara_avetyan.sort.InsertionSort;
import homework_21.zara_avetyan.sort.MergeSort;
import homework_21.zara_avetyan.sort.SelectionSort;

import java.util.ArrayList;

public class SortTest {
    public static void main(String[] args) throws InterruptedException {
        int attempt = 8;
        ArrayList<Integer> list = new RandomList().createArray(1000);
        BubbleSort bubbleSort = new BubbleSort(list, attempt);
        InsertionSort insertionSort = new InsertionSort(list, attempt);
        MergeSort mergeSort = new MergeSort(list, attempt);
        SelectionSort selectionSort = new SelectionSort(list, attempt);
        Thread t1 = new Thread(bubbleSort);
        Thread t2 = new Thread(insertionSort);
        Thread t3 = new Thread(mergeSort);
        Thread t4 = new Thread(selectionSort);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.print("           |");
        for (int i = 0; i < attempt; i++) {
            System.out.print("  run " + (i + 1) + "  |");
        }
        System.out.println("   min   |   max   |   avg   | median  |");

        bubbleSort.print("bubble");
        selectionSort.print("selection");
        insertionSort.print("insertion");
        mergeSort.print("merge");
    }
}
