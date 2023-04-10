package homework_14.Inesa_Mkrtchyan;

public class StackDemo {
    public static void main(String[] args) {
        MyStack<Integer> myStackInt = new MyStack<Integer>(10);
        myStackInt.push(20);
        myStackInt.push(30);
        myStackInt.push(2);
        myStackInt.push(5);
        myStackInt.push(50);
        while(!myStackInt.isEmpty()){
            System.out.println(myStackInt.pop());
        }
        MyStack<String> myStackStr = new MyStack<String>(10);
        myStackStr.push("Text 1");
        myStackStr.push("Text 2");
        myStackStr.push("Text 3");
        myStackStr.push("Text 4");
        myStackStr.push("Text 5");
        while(!myStackStr.isEmpty()){
            System.out.println(myStackStr.pop());
        }
    }
}