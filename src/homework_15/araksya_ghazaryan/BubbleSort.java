package homework_15.araksya_ghazaryan;

public class BubbleSort {
    public static int [] bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int array[] ={ 3, 6, 0, 5, 2, 4, 20, 5};
        bubbleSort(array);
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}