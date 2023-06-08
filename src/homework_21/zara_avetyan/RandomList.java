package homework_21.zara_avetyan;

import java.util.ArrayList;
import java.util.Random;

public class RandomList {
    public ArrayList<Integer> createArray(int lengthArray) {
        ArrayList<Integer> list = new ArrayList<>(lengthArray);
        Random randomNum = new Random();
        if (lengthArray > 1_000_000) throw new IllegalArgumentException("Unavailable length");
        for (int i = 0; i < lengthArray; i++) {
            list.add(randomNum.nextInt(1_000_000));
        }
        return list;
    }
}
