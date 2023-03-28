package homework_15.rafik_pahlevanyan.searching_algorithms;

public class LinearSearch {
    
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 6, 1, 8, 7, 4};
        int target = 6;
        int index = linearSearch(arr, target);
        if (index == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index " + index);
        }
    }
}
