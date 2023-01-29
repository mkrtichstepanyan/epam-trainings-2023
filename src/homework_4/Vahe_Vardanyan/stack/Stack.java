package homework_4.Vahe_Vardanyan.stack;

public class Stack {
    private Integer[] arr;
    private int size;

    public Stack(int capacity) {
        this.arr = new Integer[capacity];
    }

    private  int size(){
        return  this.size;
    }

  public boolean isEmpty() {
        return this.size == 0;
    }

   public boolean isFully() {
        return this.size == this.arr.length;
    }


    public void push(int value) {
        if (this.isFully()) {
            System.err.println("Error Stacl is Fully " + value);
            return;
        }
        this.arr[this.size++] = value;




    }

   public Integer pop() {
        if (this.isEmpty()) {
            System.err.println("Error Stack is Empty");
            return null;
        }
        return this.arr[--this.size];
    }

   public Integer checkAndIncrease() {
        if (size >= (arr.length * 75) / 100) {
            System.out.println("Stack is reached 75%");
            Integer[] newarr = new Integer[this.arr.length + 2];

            for (int i = 0; i < this.arr.length; ++i) {
                newarr[i] = this.arr[i];
            }
            this.arr = newarr;

        }
        return null;

    }
}
