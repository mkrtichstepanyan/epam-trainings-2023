package homework_15.Sofya_Ghazaryan;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                count++;
                if (array[j] < array[index]) {
                    index = j; //searching for lowest index
                }
            }
            int minNum = array[index];
            array[index] = array[i];
            array[i] = minNum;
        }
        System.out.println("count -> " + count);
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
