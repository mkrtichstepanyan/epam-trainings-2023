package homework_15.Diana_Melkonyan;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,9,5,4,8,1,6};
        megeSort(arr);
    }
    private static void megeSort(int[] arr){
        int n =arr.length;
        if(n==1)return;

        int mid = n/2;
        int[] l = new int[mid];
        int [] r = new int[n-mid];

        for (int i = 0; i <mid ; i++) {
            l[i]= arr[i];}
            for (int i = mid; i <n ; i++) {
                r[i-mid]=arr[i];

                megeSort(l);
                megeSort(r);
                merge(arr,l,r);
            }

        }

    private static void merge(int[] arr, int[] l, int [] r){
        int left = l.length;
        int right= r.length;
        int i =0;
        int j= 0;
        int index = 0;

        while (i<left && j< right){
            if(l[i]<r[i]){
                arr[index]=l[i];
                i++;
                index++;
            }else {
                arr[index]=r[i];
                j++;
                index++;
            }
        }


    }
}
