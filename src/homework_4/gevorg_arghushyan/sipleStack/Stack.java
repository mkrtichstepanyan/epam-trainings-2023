package homework_4.gevorg_arghushyan.sipleStack;

public class Stack {
    private int [] items ;
    private  int defaultCapacity = 3;
    private  int emptyValue = -1;
    private int size;

    public   Stack(){
        this.items = new int[defaultCapacity];
        this.size = -1;

    };

    public Stack(int capacity){
        this.items = new int[capacity];
        this.size = -1;

    }
    public void push(int item) {
        if (size >= (items.length * 0.75) - 1 ) {
            int[] newItems = new int[items.length * 2];
            System.arraycopy(items, 0, newItems, 0, items.length);
            items = newItems;
        }
        items[++size] = item;
    }

     public int pop (){
         if (size <= -1){
             System.out.println("Empty");
             return  emptyValue;
         }
         int item = items[size];
         items[size--] = 0;
         return item;
    };
};
