package homework_15.roza_petrosyan;
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {0, 1, -1, 25, 7, -15};
        printArray(sort(array));
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
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
