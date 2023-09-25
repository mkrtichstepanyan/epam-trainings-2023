package homework_21.Radik_Manasyan.sortMethods;

import homework_21.Radik_Manasyan.SortingVelocitySpeed;

import java.util.Arrays;

public class InsertionSort extends SortingVelocitySpeed {


    public InsertionSort(int[] array, int attempts) {
        super(array, attempts);
    }

    private void insertionSort(int[] array) {
        int[] copy = Arrays.stream(array).toArray();

        int tmp;

        for (int i = 0; i < copy.length - 1; i++) {
            if (copy[i] > copy[i + 1]) {
                tmp = copy[i + 1];
                for (int j = i; j >= 0; j--) {
                    if (copy[j + 1] < copy[j]) {
                        copy[j + 1] = copy[j];
                        copy[j] = tmp;
                    } else {
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void sort(int[] array) {
        insertionSort(array);
    }
}

