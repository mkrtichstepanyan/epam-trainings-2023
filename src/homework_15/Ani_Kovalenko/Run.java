package homework_15.Ani_Kovalenko;

public class Run {

    public static void main(String[] args) {

        int[] ints;

        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {2, 5, 8, 1, 3, 6, 4, 7, 9, 10};
        ints = bubbleSort.checkArray(array);
        System.out.println("Bubble Sort");
        print(ints);
        System.out.println();
        System.out.println("Total Step Count: " + bubbleSort.totalStepCount);
        System.out.println("Used Step Count: " + bubbleSort.usedStepCount);
        // try to iterate till the (array.length-1) value instead of (array.length - i -1) from the line #9, and the
        // total step count will increase.


        SelectionSort selectionSort = new SelectionSort();
        int[] array2 = {2, 5, 8, 1, 3, 6, 4, 7, 9, 10};
        ints = selectionSort.checkArray(array2);
        System.out.println();
        System.out.println("Selection Sort");
        print(ints);
        System.out.println();
        System.out.println("Total Step Count: " + selectionSort.totalStepCount);
        System.out.println("Used Step Count: " + selectionSort.usedStepCount);
        //try to start the iteration from 0 instead of i+1 in the line #9 and the total count will increase.


        InsertionSort insertionSort = new InsertionSort();
        int[] array3 = {2, 5, 8, 1, 3, 6, 4, 7, 9, 10};
        ints = insertionSort.checkArray(array3);
        System.out.println();
        System.out.println("Insertion Sort");
        print(ints);
        System.out.println();
        System.out.println("Total Step Count: " + insertionSort.totalStepCount);
        System.out.println("Used Step Count: " + insertionSort.usedStepCount);
        // try to remove the else block containing "continue" keyword from the lines #18-20, and the
        // total step count will increase.


        MergeSort mergeSort = new MergeSort();
        int[] array4 = {2, 5, 8, 1, 3, 6, 4, 7, 9, 10};
        ints = mergeSort.halveRecursively(array);
        System.out.println();
        System.out.println("Merge Sort");
        print(ints);

    }

    private static void print(int[] ints) {
        System.out.println("--------------------");
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }

}
