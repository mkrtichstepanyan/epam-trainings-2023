package homework_15.karen_mikayelyan;

public class SelectionSort {

    public static int[] sortSelection(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                count++;
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
        System.out.println("count : " + count);
        return array;
    }


}
