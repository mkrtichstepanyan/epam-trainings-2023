package homework_15.Ani_Kovalenko;

public class Run {

    public static void main(String[] args) {

        callBubble();
        callSelection();
        callInsertion();
        callMerge();

    }

    private static void callMerge() {
        MergeSort mergeSort = new MergeSort();
        int[] array4 = {2, 5, 8, 1, 3, 6, 4, 7, 9, 10};
        int[] ints = mergeSort.halveRecursively(array4);
        System.out.println();
        System.out.println("Merge Sort");
        print(ints);
    }

    private static void callInsertion() {
        InsertionSort insertionSort = new InsertionSort();
        int[] array3 = {2, 5, 8, 1, 3, 6, 4, 7, 9, 10};
        int[] ints = insertionSort.checkArray(array3);
        System.out.println();
        System.out.println("Insertion Sort");
        print(ints);
        System.out.println();
        System.out.println("Total Step Count: " + insertionSort.totalStepCount);
        System.out.println("Used Step Count: " + insertionSort.usedStepCount);
        // try to remove the else block containing "continue" keyword from the lines #18-20, and the
        // total step count will increase.
    }

    private static void callSelection() {
        SelectionSort selectionSort = new SelectionSort();
        int[] array2 = {2, 5, 8, 1, 3, 6, 4, 7, 9, 10};
        int[] ints = selectionSort.checkArray(array2);
        System.out.println();
        System.out.println("Selection Sort");
        print(ints);
        System.out.println();
        System.out.println("Total Step Count: " + selectionSort.totalStepCount);
        System.out.println("Used Step Count: " + selectionSort.usedStepCount);
        //try to start the iteration from 0 instead of i+1 in the line #9 and the total count will increase.
    }

    private static int[] callBubble() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {2, 5, 8, 1, 3, 6, 4, 7, 9, 10};
        int[] ints = bubbleSort.checkArray(array);
        System.out.println("Bubble Sort");
        print(ints);
        System.out.println();
        System.out.println("Total Step Count: " + bubbleSort.totalStepCount);
        System.out.println("Used Step Count: " + bubbleSort.usedStepCount);
        // try to iterate till the (array.length-1) value instead of (array.length - i -1) from the line #9, and the
        // total step count will increase.
        return array;
    }

    private static void print(int[] ints) {
        System.out.println("--------------------");
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }

}
