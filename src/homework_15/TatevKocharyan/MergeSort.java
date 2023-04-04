package homework_15.TatevKocharyan;

public class MergeSort {


    public static void main(String[] args) {
        int[] array = {6, 5, 3, 1, 8, 7, 2, 4};
        System.out.println("Before sorting");
        print(array);
        mergeSort(array);
        System.out.println();
        System.out.println("After sorting");
        print(array);

    }


    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }
        int singleLenght = array.length / 2;
        int[] firstArray = new int[singleLenght];
        int[] secondArray = new int[array.length - singleLenght];

        for (int i = 0; i < singleLenght; i++) {
            firstArray[i] = array[i];
        }


        int index = 0;
        for (int i = singleLenght; i < array.length; i++) {
            secondArray[index] = array[i];
            index++;
            if (index == array.length) {
                break;
            }
        }

        mergeSort(firstArray);
        mergeSort(secondArray);
        merge(array, firstArray, secondArray);


    }

    public static void merge(int[] array, int[] firstArray, int[] secondArray) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < firstArray.length && j < secondArray.length) {
            if (firstArray[i] <= secondArray[j]) {
                array[k] = firstArray[i];
                i++;
            } else {
                array[k] = secondArray[j];
                j++;
            }
            k++;
        }


        while (i < firstArray.length) {
            array[k] = firstArray[i];
            i++;
            k++;
        }
        while (i < firstArray.length) {
            array[k] = firstArray[i];
            i++;
            k++;
        }
        while (j < secondArray.length) {
            array[k] = secondArray[j];
            j++;
            k++;
        }
    }


    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
    }

}