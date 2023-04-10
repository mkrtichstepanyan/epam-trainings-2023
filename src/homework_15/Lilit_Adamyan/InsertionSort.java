package homework_15.Lilit_Adamyan;

public class InsertionSort {

    public static void main(String[] args) {

        int[]array ={5,2,6,8,1,7,5,0};
        System.out.print("Before insertionSort: ");
        printArray(array);
        System.out.print("After insertionSort: ");
        printArray(insertionSort(array));
    }


    public static int[]insertionSort(int[]array){
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;
            while (j>=0 && array[j]>temp){
                array[j+1] =array[j];
                j--;
            }
            array[j+1] = temp;
        }
        return array;
    }

    public static void printArray(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
