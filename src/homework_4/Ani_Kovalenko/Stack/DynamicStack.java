package homework_4.Ani_Kovalenko.Stack;

public class DynamicStack {
    int[] array;
    int index = -1;

    public DynamicStack(){
        array = new int[10];
    }
    public DynamicStack(int size){
        array = new int [size];
    }
    void push(int element){
        if(index>=array.length*75/100){
            int temp = array.length*2;
            int[] array2 = new int[temp];
            for(int i=0;i<array.length;i++){
                array2[i] = array[i];
            }
            array = array2;
        }
        array[++index] = element;
    }
    Integer pop(){
        if(index<0){
            System.out.println("Stack is empty !");
            return null;
        } else {
            int temp = array[index];
            return temp;
        }
    }

}
