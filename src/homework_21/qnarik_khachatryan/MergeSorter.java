package homework_21.qnarik_khachatryan;

import java.util.ArrayList;


public class MergeSorter extends AbstractSorter {

    @Override
    ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
        //dividing array into left and right sides and calling mergeArrays for them
        if (arrayList.size() == 1) {
            return arrayList;
        }
        int midPos = (int) Math.ceil((double) arrayList.size() / 2);
        ArrayList<Integer> leftSide = new ArrayList<>();
        for (int i = 0; i < midPos; i++) {
            leftSide.add(arrayList.get(i));
        }
        ArrayList<Integer> rightSide = new ArrayList<>();
        for (int i = midPos; i < arrayList.size(); i++) {
            rightSide.add(arrayList.get(i));
        }
        leftSide = sort(leftSide);
        rightSide = sort(rightSide);
        return mergeArrays(leftSide, rightSide);
    }

    //sorting and merging already divided arrays
    public static ArrayList<Integer> mergeArrays(ArrayList<Integer> leftSide, ArrayList<Integer> rightSide) {
        int leftSize = leftSide.size();
        int rightSize = rightSide.size();
        ArrayList<Integer> sortedArray = new ArrayList<>(leftSize + rightSize);
        int sortedArrayStartIndex = 0;
        int leftPointer = 0;
        int rightPointer = 0;


        while (leftPointer < leftSize && rightPointer < rightSize) {
            if (leftSide.get(leftPointer) < rightSide.get(rightPointer)) {
                sortedArray.add(leftSide.get(leftPointer));
                sortedArrayStartIndex++;
                leftPointer++;

            } else {
                sortedArray.add(rightSide.get(rightPointer));
                sortedArrayStartIndex++;
                rightPointer++;
            }
        }

        if (leftPointer == leftSize) {
            while (rightPointer < rightSize) {
                sortedArray.add(rightSide.get(rightPointer));
                sortedArrayStartIndex++;
                rightPointer++;
            }
        }

        if (rightPointer == rightSize) {
            while (leftPointer < leftSize) {
                sortedArray.add(leftSide.get(leftPointer));
                sortedArrayStartIndex++;
                leftPointer++;
            }
        }
        return sortedArray;
    }
}
