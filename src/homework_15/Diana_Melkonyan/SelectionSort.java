package homework_15.Diana_Melkonyan;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1000, 5, 7, 400, 13, 19};
        selection_sort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }

        private static void selection_sort(int[] arr){
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                int min_index = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[min_index] > arr[j])
                        min_index = j;

                }
                swap(i, min_index, arr);
            }
        }
        private static void swap ( int i, int min_index, int[] arr){
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }


