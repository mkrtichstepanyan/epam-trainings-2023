package homework_15.Yeghia_Ansuryan;

public class InsertSort {

    public static void main(String[] args) {

        InsertSort insertSort = new InsertSort();
        insertSort.insertSort();
        insertSort.print();

    }

    int[] array = {5, 8, 1, 9, -10, 4, 7, 2, 6, 3};

    private void print() {

        System.out.println("Insert Sort !!");

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }

    private void insertSort() {

        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            int temp = array[currentIndex];
            int index = currentIndex - 1;

            while (index >= 0 && array[index] > temp) {
                array[index + 1] = array[index];
                index--;
            }
            array[index + 1] = temp;

        }
    }
}
