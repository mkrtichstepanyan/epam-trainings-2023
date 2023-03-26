package homework_15.roza_petrosyan;
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {0, 1, -1, 25, 7, -15};
        printArray(sort(array));
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int temp = array[i];
                array[i] = array[j];
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
