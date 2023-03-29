package homework_15.Yeghia_Ansuryan;

public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort();
        selectionSort.print();
    }

    int[] array = {5, 8, 1, 9, -10, 4, 7, 2, 6, 3};

    private void print() {

        System.out.println("Selection Sort");

        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }

    private void selectionSort() {
        for (int index = 0; index < array.length - 1; index++) {
            int minIndex = index;
            for (int currentIndex = index + 1; currentIndex < array.length; currentIndex++) {
                if (array[minIndex] > array[currentIndex]) {
                    minIndex = currentIndex;
                }
            }
            swap(index, minIndex, array);
        }

    }

    private void swap(int index, int minIndex, int[] array) {
        int tamp = array[index];
        array[index] = array[minIndex];
        array[minIndex] = tamp;
    }

}
