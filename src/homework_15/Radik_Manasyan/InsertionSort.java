package homework_15.Radik_Manasyan;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {-13,3, 2, 12, 5, 9, -4, 15,-1};
        insertionSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }


    public static void insertionSort(int[] array) {
        int tmp;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                tmp = array[i + 1];
                for (int j = i; j >= 0; j--) {
                    if (array[j+1] < array[j]){
                        array[j + 1] = array[j];
                        array[j] = tmp;
                    }else {
                        break;
                    }
                }
            }
        }
    }
}

