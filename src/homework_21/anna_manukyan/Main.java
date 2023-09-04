package homework_21.anna_manukyan;

import homework_21.anna_manukyan.sort.*;
import homework_21.anna_manukyan.utility.MathFunctions;

import java.util.ArrayList;
import java.util.List;

import static homework_21.anna_manukyan.utility.PrintUtility.printLine;
import static homework_21.anna_manukyan.utility.PrintUtility.printList;

public class Main {
    public static void main(String[] args) {
        SpeedCalculation calculation = new SpeedCalculation(30, 4);

        SortingAlgorithm bubbleSort = new BubbleSort();
        SortingAlgorithm insertionSort = new InsertionSort();
        SortingAlgorithm selectionSort = new SelectionSort();
        SortingAlgorithm mergeSort = new MergeSort();


        //Bubble sort
        List<Long> bubbleAttemptsList = calculation.executeSort(bubbleSort);
        long bubbleMax = MathFunctions.getMax(bubbleAttemptsList);
        System.out.println("Max element using bubble sort: " + bubbleMax);
        long bubbleMin = MathFunctions.getMin(bubbleAttemptsList);
        System.out.println("Min element using bubble sort: " + bubbleMin);
        long bubbleAvg = MathFunctions.getAvg(bubbleAttemptsList);
        System.out.println("Average of elements using bubble sort: " + bubbleAvg);
        ArrayList<Long> bubbleMedian = MathFunctions.getMedian(bubbleAttemptsList);
        System.out.print("Median element using bubble sort: ");
        printList(bubbleMedian);
        printLine();


        //Insertion sort
        List<Long> insertionAttemptsList = calculation.executeSort(insertionSort);
        long insertionMax = MathFunctions.getMax(insertionAttemptsList);
        System.out.println("Max element using insertion sort: " + insertionMax);
        long insertionMin = MathFunctions.getMin(insertionAttemptsList);
        System.out.println("Min element using insertion sort: " + insertionMin);
        long insertionAvg = MathFunctions.getAvg(insertionAttemptsList);
        System.out.println("Average of elements using insertion sort: " + insertionAvg);
        ArrayList<Long> insertionMedian = MathFunctions.getMedian(insertionAttemptsList);
        System.out.print("Median element using insertion sort: ");
        printList(insertionMedian);
        printLine();

        //Selection sort
        List<Long> selectionAttemptsList = calculation.executeSort(selectionSort);
        long selectionMax = MathFunctions.getMax(selectionAttemptsList);
        System.out.println("Max element using selection sort: " + selectionMax);
        long selectionMin = MathFunctions.getMin(selectionAttemptsList);
        System.out.println("Min element using selection sort: " + selectionMin);
        long selectionAvg = MathFunctions.getAvg(selectionAttemptsList);
        System.out.println("Average of elements using selection sort: " + selectionAvg);
        ArrayList<Long> selectionMedian = MathFunctions.getMedian(selectionAttemptsList);
        System.out.print("Median element using selection sort: ");
        printList(selectionMedian);
        printLine();


        //Merge sort
        List<Long> mergeAttemptsList = calculation.executeSort(mergeSort);
        long mergeMax = MathFunctions.getMax(mergeAttemptsList);
        System.out.println("Max element using merge sort: " + mergeMax);
        long mergeMin = MathFunctions.getMin(mergeAttemptsList);
        System.out.println("Min element using merge sort: " + mergeMin);
        long mergeAvg = MathFunctions.getAvg(mergeAttemptsList);
        System.out.println("Average  of elements using merge sort: " + mergeAvg);
        ArrayList<Long> mergeMedian = MathFunctions.getMedian(mergeAttemptsList);
        System.out.print("Median element using merge sort: ");
        printList(mergeMedian);
        printLine();

        System.out.println("End of tasks");
    }

}
