package homework_15.karen_mikayelyan;

import static homework_15.karen_mikayelyan.BubbleSort.printArray;
import static homework_15.karen_mikayelyan.BubbleSort.sortBubble;

public class Main {


    public static void main(String[] args) {
        int[] array = {7, 5, -1, 2, 8, 9, 3, 4, 1, 0, 6};

//        printArray(sortBubble(array));
//        printArray(SelectionSort.sortSelection(array));
//        printArray(InsertionSort.sortInsertion(array));
        printArray(MergeSort.sortMerge(array));

    }
}