package homework_21.Diana_Melkonyan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
public class RandomList {
    private static final Random random = new Random();
    public static int[] randomInteger(int length) {
        List<Integer> listIntegers = new LinkedList<>();
        try {
            if (length > 1_000_000 || length <= 0) {
                throw new IllegalArgumentException();
            } else {
                for (int i = 0; i < length; i++) {

                    listIntegers.add(random.nextInt(length));
                }
            }

        } catch (IllegalArgumentException e) {
           e.printStackTrace();
        }
        return listIntegers.stream().mapToInt(Integer::intValue).toArray();
    }
}
