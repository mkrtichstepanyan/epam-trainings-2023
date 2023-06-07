package homework_15.Eduard_Eghiazaryan;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 8, 4, 0, 3, 1};
        bubble_sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
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
}
