package homework_15.Eduard_Eghiazaryan;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 99, 8, 6, 33, 11};
        insertion_sort(arr);


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void insertion_sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n ; i++) {
            int curr = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
    }
}
