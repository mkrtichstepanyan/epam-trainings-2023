package homework_15.aram_mehrabyan;
public class SelectionSort {
    public static void main(String[] args) {
        int []arr={2,11,7,1,5,10,3};
        for(int i=0;i<arr.length;i++){
            int k=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[k]){
                    k=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
        }
        for (Integer a:arr)
            System.out.print(a);
    }
}
