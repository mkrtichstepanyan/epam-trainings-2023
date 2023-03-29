package homework_15.Yeghia_Ansuryan;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {5, 8, 1, 9, -10, 4, 7, 2, 6, 3};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(array);

        System.out.println("Bubble Sort");

        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }

    private void bubbleSort(int[] array) {

        boolean temp = true;
        while (temp) {
            temp = false;
            for (int index = 0; index < array.length - 1; index++) {
                if (array[index] > array[index + 1]) {
                    int number = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = number;
                    temp = true;
                }
            }
        }
    }
}

