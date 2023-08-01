package homework_21.qnarik_khachatryan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class IntegerList {
    public static ArrayList<Integer> generateArrayList(int length) {
        Random rd = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(rd.nextInt());
        }
        return arrayList;
    }
}
