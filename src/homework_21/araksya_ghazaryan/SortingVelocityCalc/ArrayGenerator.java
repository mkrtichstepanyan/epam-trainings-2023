package homework_21.araksya_ghazaryan.SortingVelocityCalc;
import java.util.Random;
public class ArrayGenerator {
    public static int[] generateArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
}
interface SortingAlgorithm {
    void sort(int[] array);
}
