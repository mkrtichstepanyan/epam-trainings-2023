package homework_15.gohar_hakobyan;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {2, 0, 87, -6, 1, 100};
        printArray(sort(nums));
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - i - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[j] <= array[min]) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
        return array;
    }


    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
