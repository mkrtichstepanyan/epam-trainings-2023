package homework_21.qnarik_khachatryan;

import java.util.ArrayList;

public class QuickSorter extends AbstractSorter {

    @Override
    ArrayList<Integer> sort(ArrayList<Integer> arrayList) {

        return quickSort(arrayList, 0, arrayList.size() - 1);

    }


    public ArrayList<Integer> quickSort(ArrayList<Integer> arrayList, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arrayList, begin, end);

            quickSort(arrayList, begin, partitionIndex - 1);
            quickSort(arrayList, partitionIndex + 1, end);
        }
        return arrayList;
    }

    private int partition(ArrayList<Integer> arrayList, int begin, int end) {
        int pivot = arrayList.get(end);
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arrayList.get(j) <= pivot) {
                i++;

                int swapTemp = arrayList.get(i);
                arrayList.set(i, arrayList.get(j));
                arrayList.set(j, swapTemp);
            }
        }

        int swapTemp = arrayList.get(i + 1);
        arrayList.set(i + 1, arrayList.get(end));
        arrayList.set(end, swapTemp);

        return i + 1;
    }
}
