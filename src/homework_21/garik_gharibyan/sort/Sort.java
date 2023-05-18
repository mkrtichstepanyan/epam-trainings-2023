package homework_21.garik_gharibyan.sort;

import java.util.ArrayList;


public class Sort {
    public static ArrayList<Integer> selection(ArrayList<Integer> list) {
        ArrayList<Integer> nList =(ArrayList<Integer>) list.clone();

        int indexMinValue;
        int temp;

        for (int i = 0; i < nList.size() - 1; i++) {
            indexMinValue = i;
            for (int k = i; k < nList.size() - 1; k++) {
                if (nList.get(k + 1) < nList.get(indexMinValue)) {
                    indexMinValue = k + 1;
                }
            }
            temp = nList.get(i);
            nList.set(i,nList.get(indexMinValue));
            nList.set(indexMinValue,temp);

        }
        return nList;
    }

    public static ArrayList<Integer> insertion(ArrayList<Integer> list) {
        ArrayList<Integer> nList =(ArrayList<Integer>) list.clone();
        int temp;
        for (int k = 0; k < nList.size(); k++) {

            for (int i = k; i > 0; i--) {

                if (nList.get(i) < nList.get(i - 1)) {
                    temp = nList.get(i - 1);
                    nList.set(i-1, nList.get(i));
                    nList.set(i,temp);
                } else {
                    break;
                }
            }
        }
        return nList;
    }

    public static ArrayList<Integer> bubble(ArrayList<Integer> list) {
        ArrayList<Integer> nList =(ArrayList<Integer>) list.clone();
        int temp;

        for (int k = 0; k < nList.size()-1; k++) {
            for (int i = 0; i < nList.size() - k - 1; i++) {
                if (nList.get(i) > nList.get(i+1)){
                    temp = nList.get(i);
                    nList.set(i,nList.get(i+1));
                    nList.set(i+1,temp);
                }
            }
        }
        return nList;
    }
}
