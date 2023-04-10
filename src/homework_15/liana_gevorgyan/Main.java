package homework_15.liana_gevorgyan;

public class Main {

    private static final int[] mixedForBubble = {22,45,-4,8,1,4,90,200};// [10,9,8,7,6,5,4,3,2,1]
    private static final int[] mixedForSelection = {67,89,1,7,3,-5,8,-54};
    private static final int[] mixedForInsertion = {182,77,4,-67,89,0,23,5};
    private static final int[] mixedForMerge = {90,3,3,56,-4,-8,7,5};

    public static void main(String[] args) {

        System.out.println("Bubble");
        System.out.println("Original");
        printArray(mixedForBubble);
        System.out.println("Sorted");
        printArray(SortHelper.bubbleSort(mixedForBubble));
        System.out.println();

        System.out.println("Selection");
        System.out.println("Original");
        printArray(mixedForSelection);
        System.out.println("Sorted");
        printArray(SortHelper.selectionSort(mixedForSelection));
        System.out.println();

        System.out.println("Insertion");
        System.out.println("Original");
        printArray(mixedForInsertion);
        System.out.println("Sorted");
        printArray(SortHelper.insertionSort(mixedForInsertion));
        System.out.println();

        System.out.println("Merge");
        System.out.println("Original");
        printArray(mixedForMerge);
        System.out.println("Sorted");
        printArray(SortHelper.mergeSort(mixedForMerge));
    }

    private static void printArray(int[] arrayToPrint) {
        for (int element : arrayToPrint) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
