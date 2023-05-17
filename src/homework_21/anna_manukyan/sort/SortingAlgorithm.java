package homework_21.anna_manukyan.sort;

public interface SortingAlgorithm {
    int[] sort(int[] array);

    default void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
