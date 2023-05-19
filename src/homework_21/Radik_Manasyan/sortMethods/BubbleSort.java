package homework_21.Radik_Manasyan.sortMethods;

import homework_21.Radik_Manasyan.SortingVelocitySpeed;

import java.util.Arrays;


public class BubbleSort extends SortingVelocitySpeed {

    public BubbleSort(int[] array, int countAttempts) {
        super(array, countAttempts);
    }

    @Override
    public void sort(int[] array) {
        bubbleSort(array);
    }

    private void bubbleSort(int[] array) {
        int[] copy = Arrays.stream(array).toArray();

        for (int i = 0; i < copy.length; i++) {
            for (int j = i + 1; j < copy.length; j++) {
                if (copy[i] > copy[j]) {
                    int temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;
                }
            }
        }
    }
}
