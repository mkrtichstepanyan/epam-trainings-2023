package homework_15.garik_gharibyan;

public class Sort {

    public static int[] selection(int[] array) {
        int indexMinValue;
        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            indexMinValue = i;
            for (int k = i; k < array.length - 1; k++) {
                if (array[k + 1] < array[indexMinValue]) {
                    indexMinValue = k + 1;
                }
            }
            temp = array[i];
            array[i] = array[indexMinValue];
            array[indexMinValue] = temp;

        }
        return array;
    }

    public static int[] insertion(int[] array) {
        int temp;
        for (int k = 0; k < array.length; k++) {

            for (int i = k; i > 0; i--) {

                if (array[i] < array[i - 1]) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                } else {
                    break;
                }
            }
        }
        return array;
    }

    public static int[] bubble(int[] array) {
        int temp;

        for (int k = 0; k < array.length-1; k++) {
            for (int i = 0; i < array.length - k - 1; i++) {
                if (array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        return array;
    }

}
