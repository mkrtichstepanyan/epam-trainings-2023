package homework_15.aram_mehrabyan;

public class BubbleSort {
    public static void main(String[] args) {
        int temp;
        int []arr={4,3,5,10,50,2,20,};
        for(int i=0;i< arr.length;i++){
           for(int j=i+1;j< arr.length;j++) {
               if(arr[i]>arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
        }
        for(Integer a:arr)
            System.out.print(a);
    }

}
