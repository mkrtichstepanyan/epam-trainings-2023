package homework_15.garik_gharibyan;

public class Main {
    public static void main(String[] args) {
        int[] array = {4, 75, 85, 2, 6, 4, -5, 0, -4, 1, 6, 96, 23};

        Printer.printArray(array);
        Printer.printArray(Sort.selection(array));
        Printer.printArray(Sort.insertion(array));
        Printer.printArray(Sort.bubble(array));

        Printer.printArray(MergeSort.sort(array));


    }
}
