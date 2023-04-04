package homework_15.Radik_Manasyan;


public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {-13,3, -14, 2, 12, 5, 9, -4, 15,-1};

        selectionSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void selectionSort(int[] array) {
        int tmp;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            tmp = array[i];

            for (int j = i; j < array.length; j++) {
                if(tmp > array[j]){
                    tmp = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = tmp;
        }
    }
}
