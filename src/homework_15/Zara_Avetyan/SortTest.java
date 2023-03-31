package homework_15.Zara_Avetyan;

public class SortTest {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 9, 3, 7, 2, 8, 6};
        PrintArray.print(BubbleSort.sort(array));
        PrintArray.print(SelectionSort.sort(array));
        PrintArray.print(InsertionSort.sort(array));
        PrintArray.print(MergeSort.sort(array));
    }
}
