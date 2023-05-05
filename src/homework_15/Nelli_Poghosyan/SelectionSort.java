package homework_15.Nelli_Poghosyan;

public class SelectionSort {
public static int[] selectionSort(int[] array){
    for(int i = 0; i < array.length-1; i++){
        int minIndex = i;
        for (int j = i + 1; j < array.length; j++){
if (array[j]<array[minIndex]){
    minIndex=j;
}
        }
        int temp = array[minIndex];
        array[minIndex] = array[i];
        array[i]=temp;

    }return array;

}

    public static void main(String[] args) {
        int array[] = {12, 4, 74, 21, 1, 2, 51};
        selectionSort(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
