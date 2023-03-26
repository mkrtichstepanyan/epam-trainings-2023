package homework_15.gohar_hakobyan;

public class InsertionSort {
    public static void main(String[] args) {

        int[] nums = {2, 0, 87, -6, 1, 100};
        printArray(sort(nums));
    }

    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > tmp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tmp;
        }
        return array;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
