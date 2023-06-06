package homework_21.Diana_Melkonyan.sort;

import homework_21.Diana_Melkonyan.SortingAlgoritms;

public class BubbleSort extends SortingAlgoritms {
    public BubbleSort(int[] array, int attempts) {
        super(array, attempts);
    }

    private static void bubble_sort(int[] arr) {
        boolean curr = true;
        while (curr) {
            curr = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;
                    curr = true;
                }
            }

        }
    }

    @Override
    public void sort(int[] array) {
        bubble_sort(array);
    }
}
