package homework_21.qnarik_khachatryan;

import java.util.ArrayList;

public class SelectionSorter extends AbstractSorter {

    @Override
    ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            int min = arrayList.get(i);
            int minElIndex = i;
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(j) < min) {
                    min = arrayList.get(j);
                    minElIndex = j;
                }
            }
            arrayList.set(minElIndex, arrayList.get(i));
            arrayList.set(i, min);
        }
        return arrayList;
    }
}
