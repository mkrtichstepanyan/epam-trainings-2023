package homework_4.Inesa_Mkrtchyan.Homework4_1;;

public class MyStack {
    private static final int defaultSize = 10;
    private String[] arr;
    private int size;
    private int length;


    public MyStack() {
        length = defaultSize;
        arr = new String[length];
        size = -1;
    }

    public MyStack(int length) {
        this.length = length;
        arr = new String[length];
        size = -1;
    }

    public void push(String value) {
        if (size >= (length * 75) / 100) {
            extendCapasity();
        }
        arr[++size] = value;

    }
    private void extendCapasity(){
        String[] newArr = new String[length * 2];
        for (int i = 0; i <= size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        length *= 2;
    }
    public String pop() {
        if (size < 0) {
            System.out.println("Stack is empty");
            return null;
        }
        String result = arr[size];
        arr[size--] = null;
        return result;
    }
    public int getSize(){
        return size;
    }
}
