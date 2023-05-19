package homework_15.Davit_Poghosyan;

public class BubbleSort {
    public static int [] bubbleSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length- 1 - i; j++){
                int temp = 0;
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {10, 2, 4, 150,1,45,7};
        bubbleSort(array);

        for (int i =0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
