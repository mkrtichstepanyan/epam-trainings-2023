package homework_15.Vahe_Vardanyan;

public class SelectionSort {
    public static int[] SelectionSort(int[] array){
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = 0; j < array.length; j++) {
                count++;
                if (array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
        System.out.println("count " + count);
        return array;
    }
}
