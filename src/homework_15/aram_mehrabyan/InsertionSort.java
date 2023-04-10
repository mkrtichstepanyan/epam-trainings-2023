package homework_15.aram_mehrabyan;
public class InsertionSort {
public static int[] Swap(int []arr,int index1,int index2){
    int temp;
    if(arr[index2]>arr[index1]){
        temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    return arr;
}
    public static void main(String[] args) {

        int []arr={2,1,7,3,5,10,8,0};

        for(int i=0;i< arr.length;i++){
            for(int j=0;j<i;j++){
                Swap(arr,i,j);
            }
        }
        for(Integer a:arr)
            System.out.print(a);
    }
}

