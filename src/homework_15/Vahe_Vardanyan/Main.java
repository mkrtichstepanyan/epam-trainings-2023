package homework_15.Vahe_Vardanyan;

public class Main {
    public static void main(String[] args) {
        int[] array = {9,7,2,1,3,0,5,4,8,6};

        printArray(BubbleSort.BubbleSort(array));
        printArray(SelectionSort.SelectionSort(array));
        printArray(InsertionSort.InsertionSort(array));
    }
    
       public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i + " ");
        }
    }
}
