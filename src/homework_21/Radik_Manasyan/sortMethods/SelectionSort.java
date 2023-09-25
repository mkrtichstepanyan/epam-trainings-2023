package homework_21.Radik_Manasyan.sortMethods;


import homework_21.Radik_Manasyan.SortingVelocitySpeed;

import java.util.Arrays;

public class SelectionSort extends SortingVelocitySpeed {

    public SelectionSort(int[] array, int attempts) {
        super(array, attempts);
    }

    @Override
    public void sort(int[] array) {
        selectionSort(array);
    }

    private void selectionSort(int[] array) {
        int[] copy = Arrays.stream(array).toArray();

        int tmp;
        int index = 0;
        for (int i = 0; i < copy.length; i++) {
            tmp = copy[i];

            for (int j = i; j < copy.length; j++) {
                if (tmp > copy[j]) {
                    tmp = copy[j];
                    index = j;
                }
            }
            copy[index] = copy[i];
            copy[i] = tmp;
        }
    }
}
