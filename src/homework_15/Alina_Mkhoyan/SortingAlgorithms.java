package homework_15.Alina_Mkhoyan;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 8, 3, 5, 5, -26, 9, 10, 12, -16};
        System.out.println("Initial Array: 2,1,8,3,5,5,-26,9,10,12,-16 ");
        System.out.println("------------------------------------------");
//        sortByBubbleSorting(array);
//        print(array);
//        System.out.println();
        sortBySelectionSorting(array);
        print(array);
        System.out.println();
//        sortByInsertionSorting(array);
//        print(array);
//        System.out.println();
//        sortByMergeSorting(array);
//        System.out.print("Merge sort--->");
//        print(array);
//        System.out.println();
    }

    public static void sortByBubbleSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j + 1, j);
                }
            }
        }
        System.out.print("Bubble Sorting---->");
    }

    public static void sortBySelectionSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, minIndex, i);
            }
        System.out.print("Selection Sorting--->");
    }

    public static void sortByInsertionSorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = i;
            while ((j > 0) && (array[j - 1] > array[j])) {
                int tmp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = tmp;
                j--;
            }
        }
        System.out.print("Insertion String--->");
    }

    public static void sortByMergeSorting(int[] array) {
        if (array.length < 2)
            return;
        int halfLength = array.length / 2;
        int[] leftHalf = new int[halfLength];
        int[] rightHalf = new int[array.length - halfLength];
        for (int i = 0; i < leftHalf.length; i++) {
            leftHalf[i] = array[i];
        }
        for (int i = 0; i < rightHalf.length; i++) {
            rightHalf[i] = array[leftHalf.length + i];
        }
        sortByMergeSorting(rightHalf);
        sortByMergeSorting(leftHalf);
        merge(array, leftHalf, rightHalf);
    }

    private static void merge(int[] result, int[] arrayOne, int[] arrayTwo) {
        int i = 0, j = 0, k = 0;
        while (i < arrayOne.length && j < arrayTwo.length) {
            if (arrayOne[i] <= arrayTwo[j]) {
                result[k++] = arrayOne[i++];
            } else {
                result[k++] = arrayTwo[j];
                arrayTwo[j++] = arrayOne[i];
            }
        }
        while (i < arrayOne.length) {
            result[k++] = arrayOne[i++];
        }
        while (j < arrayTwo.length) {
            result[k++] = arrayTwo[j++];
        }
    }

    private static void swap(int[] array, int firstIndex, int lastIndex) {
        int tempValue = array[firstIndex];
        array[firstIndex] = array[lastIndex];
        array[lastIndex] = tempValue;
    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + ",");
        }
    }
}

