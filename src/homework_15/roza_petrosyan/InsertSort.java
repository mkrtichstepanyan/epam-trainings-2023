package homework_15.roza_petrosyan;
public class InsertSort {
    public static void main(String[] args) {
        int[] array = {0, 1, -1, 25, 7, -15};
        printArray(sort(array));
    }

    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int temp = array[i];
            for (int j = i - 1; j >= 0 && array[j] > temp; j--) {
                array[j + 1] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int item : array) {
            System.out.print(" " + item + " ");
        }
        System.out.print(']');
    }
}
