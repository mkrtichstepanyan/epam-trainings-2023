package homework_15.Lilit_Adamyan;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {25, 14, 2, 6, 7, 1, 95, 45, 85, 74, 12};
        System.out.println("Before mergesort: ");
        printArray(array);
        System.out.println("After mergeSort: ");
        printArray(mergeSort(array));

    }

    public static int[] mergeSort(int[] array) {
        int inputLength = array.length;

        //if we have an array with 1 element
        if (inputLength < 2) {
            return array;
        }
        //divide our array int two parts and find the middle
        int midIndex = inputLength/2;
        int[]leftHalf = new int[midIndex];
        int[]rightHalf = new int[inputLength - midIndex];

        //loop for the leftHalf
        //copy the elements of our array into leftHalf array
        for (int i = 0; i < midIndex; i++) {
          leftHalf[i]= array[i];
        }

        //copy the elements of our array into rightHalf array
        //loop will start from midIndex
        for (int i = midIndex; i <inputLength ; i++) {
          rightHalf[i-midIndex ] =array[i];
        }

        //here we need to merge left and right array recursively
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //now we have to merge these  two arrays to a large array
        // create a new method merge
        merge(array,leftHalf,rightHalf);
        return array;
    }
    private static void merge(int[]inputArray,int[]leftHalf,int[]rightHalf){
        int leftSize = leftHalf.length;
        int rightSize= rightHalf.length;
        int i = 0;   //will iterate through leftHalf
        int j = 0;   //will iterate through rightHalf
        int k = 0;   //will iterate through the large array

        while(i<leftSize && j<rightSize){
            if(leftHalf[i]<=rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            }else{
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        //if we have left only one array,then we add it to our new (
        while(i<leftSize){
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while(j<rightSize){
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
