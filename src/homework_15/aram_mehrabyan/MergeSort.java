package homework_15.aram_mehrabyan;
public class MergeSort {
    public static void main(String[] args) {

        int []arr={20,15,40,16,14,50,8};
       mergesort(arr);
       for (int i=0;i<arr.length;i++){
           System.out.print(arr[i]);
       }

    }

    private static void mergesort(int[] arr) {
        int length= arr.length;
        if(length<=1) return;
        int middle=length/2;
        int []Larray=new int[middle];
        int []Rarray=new int[length-middle];
        int i=0;
        int j=0;
        for(;i<length;i++){
            if(i<middle){
                Larray[i]=arr[i];
            }else{
                Rarray[j]=arr[i];
                j++;
            }
        }
        mergesort(Larray);
        mergesort(Rarray);
        merge(Larray,Rarray,arr);
    }

    private static void merge(int []larr,int []rarr,int []arr){
        int lSize=arr.length/2;
        int rSize=arr.length-lSize;
        int i=0,l=0,r=0;
        while (l<lSize&&r<rSize){
            if(larr[l]<rarr[r]){
                arr[i]=larr[l];
                i++;
                l++;
            }else {
                arr[i]=rarr[r];
                i++;
                r++;
            }
        }
        while (l<lSize){
            arr[i]=larr[l];
            i++;
            l++;
        }
        while (r<rSize){
            arr[i]=rarr[r];
            i++;
            r++;
        }
    }
}
