package homework_21.qnarik_khachatryan;

import java.util.ArrayList;

public class BubbleSorter extends AbstractSorter {

    @Override
    ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = 0; j < arrayList.size() - i - 1; j++) {
                if (arrayList.get(j) > arrayList.get(j + 1)) {
                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }
        return arrayList;
    }
}
