package homework_15.Argishti_Mesropyan;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arrayNumber = {8, 5, 4, 6, 9, 3, 7, 2, 0, 1};
        sortNumber(arrayNumber);
    }


    public static void sortNumber(int[] arrayNumber) {
        for (int i = 0; i < arrayNumber.length; i++) {
            int minValue = i;
            for (int j = i + 1; j < arrayNumber.length; j++) {
                if (arrayNumber[j] < arrayNumber[minValue]) {
                    minValue = j;
                }
            }
            int temp = arrayNumber[minValue];
            arrayNumber[minValue] = arrayNumber[i];
            arrayNumber[i] = temp;
            System.out.print(arrayNumber[i] + " ");
        }
    }
}
