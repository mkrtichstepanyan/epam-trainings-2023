package homework_21.Diana_Melkonyan.sort;

import homework_21.Diana_Melkonyan.SortingAlgoritms;

public class MergeSort extends SortingAlgoritms {
    public MergeSort(int[] array, int attempts) {
        super(array, attempts);
    }

    private static void megeSort(int[] arr) {
        int n = arr.length;
        if (n ==1) return;

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }
        megeSort(l);
        megeSort(r);
        merge(arr, l, r);
    }

    private static void merge(int[] arr, int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int i = 0;
        int j = 0;
        int index = 0;

        while (i < left && j < right) {
            if (l[i] < r[j]) {
                arr[index] = l[i];
                i++;
                index++;
            } else {
                arr[index] = r[j];
                j++;
                index++;
            }
        }
        for (int ll = i; ll < left; ll++) {
            arr[index++] = l[ll];

        }
        for (int rr = j; rr < right; rr++) {
            arr[index++] = r[rr];

        }

    }

    @Override
    public void sort(int[] array) {
        megeSort(array);
    }
}
