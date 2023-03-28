package homework_15.gohar_hakobyan;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {2, 0, 87, 6, 1, 100};;
        printArray(sort(nums));

    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] > array[j]) {
                    int result;
                    result = array[i];
                    array[i] = array[j];
                    array[j] = result;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}

