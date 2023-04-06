package homework_16.anna_manukyan.generic_dynamic_array;

public class GenericInsertionSort<T> {

    public T[] sortArray(T[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i;
            if (arr[j + 1] != null) {
                while (arr[j + 1].toString().length() < arr[j].toString().length()) {
                    swap(arr, j);
                    count++;
                    j--;
                }
            }
        }
        System.out.println(count);
        return arr;
    }

    private void swap(T[] arr, int index) {
        T tmp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = tmp;

    }

    public void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null){
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }
}
