package homework_21.garik_gharibyan;

import java.util.ArrayList;
import java.util.Collections;

public class RandomList {

    public static ArrayList<Integer> create(int length) {
        if (length < 0 || length > 1_000_000) {
            throw new IllegalArgumentException("length must be in range: [0-1_000_000]");
        }

        ArrayList<Integer> arrayList = new ArrayList<>(length);

        for (int i = 0; i < length; i++) {
            arrayList.add(i);
        }

        Collections.shuffle(arrayList);

        return arrayList;
    }
}
