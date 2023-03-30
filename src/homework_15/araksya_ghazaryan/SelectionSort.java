package homework_15.araksya_ghazaryan;

public class SelectionSort {
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
        public static void main (String[]args){
            int[] array = {3, 6, 0, 5, 2, 4, 20, 5};
            selectionSort(array);
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
