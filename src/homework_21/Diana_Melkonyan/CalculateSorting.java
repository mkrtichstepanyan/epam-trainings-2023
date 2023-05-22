package homework_21.Diana_Melkonyan;

import homework_21.Diana_Melkonyan.sort.BubbleSort;
import homework_21.Diana_Melkonyan.sort.InsertionSort;
import homework_21.Diana_Melkonyan.sort.MergeSort;
import homework_21.Diana_Melkonyan.sort.SelectionSort;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class CalculateSorting {
    public static void main(String[] args) {
        CalculateSorting calculateSorting=new CalculateSorting();
        calculateSorting.executeSorting(5,4);

    }
    public void executeSorting(int length, int attempts) {

        int[] list = RandomList.randomInteger(length);

        BubbleSort bubbleSort=new BubbleSort(list,attempts);
        InsertionSort insertionSort=new InsertionSort(list,attempts);
        MergeSort mergeSort=new MergeSort(list,attempts);
        SelectionSort selectionSort=new SelectionSort(list,attempts);

        Thread t1=new Thread(bubbleSort);
        Thread t2=new Thread(insertionSort);
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

        System.out.print("Sort method    |");
        for (int i = 0; i < attempts; i++) {
            System.out.printf("run %-4s|", (i + 1));
        }
        System.out.print(" max | min | avg | medium \n");

        bubbleSort.print("bubbleSort");
        insertionSort.print("selectionSort");
        mergeSort.print("insertionSort");
        selectionSort.print("mergeSort");
    }
}
