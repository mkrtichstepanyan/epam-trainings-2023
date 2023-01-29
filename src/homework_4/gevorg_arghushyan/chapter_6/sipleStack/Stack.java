package homework_4.gevorg_arghushyan.chapter_6.sipleStack;

public class Stack {
    int [] items ;
    private static final int DEFAULT_CAPACITY = 10;
    private static final int EMPTY_VALUE = -1;
    private int size;

    public   Stack(){
        this(DEFAULT_CAPACITY);

    };
    public Stack(int capacity){
        this.items = new int[capacity];
        this.size = -1;

    };
   public void push (int item){
       if (size + 1 >= items.length){
           System.out.println("Full");
           return;
       }
       items[++size] = item;
    };
     public int pop (){
         if (size <= -1){
             System.out.println("Empty");
             return  EMPTY_VALUE;
         }
         int item = items[size];
         items[size--]=0;

         return item;
    };
};
