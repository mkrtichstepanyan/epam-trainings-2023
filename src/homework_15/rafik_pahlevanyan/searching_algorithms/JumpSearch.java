package homework_15.rafik_pahlevanyan.searching_algorithms;

public class JumpSearch {
    
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int blockSize = (int) Math.sqrt(n);
        int left = 0;
        int right = blockSize - 1;
        
        while (right < n && arr[right] < target) {
            left = right;
            right += blockSize;
            if (right > n - 1) {
                right = n;
            }
        }
        
        for (int i = left; i < right; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 6;
        int index = jumpSearch(arr, target);
        if (index == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index " + index);
        }
    }
}
