package homework_15.Argishti_Mesropyan;

public class BubbleSort {
    public static void main(String[] args) {

        int[] bubbleSort = {8, 2, 9, 7, 6, 4, 5, 3, 0, 1};
        printArray(Sort(bubbleSort));
    }

    public static int[] Sort(int[] sort) {
        for (int i = 0; i < sort.length - 1; i++) {
            for (int j = 0; j < sort.length - i - 1; j++) {
                if (sort[j] > sort[j + 1]) {
                    int temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }
        }
        return sort;
    }

    public static void printArray(int[] bubble) {
        for (int i = 0; i < bubble.length; i++) {
            System.out.print(bubble[i] + " ");
        }
    }
}
