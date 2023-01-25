package homework_4.Araksya_Ghazaryan;

public class StackTest {
    public static void main(String[] args) {
        Stack mystack = new Stack();
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(18);
        mystack.push(11);
        mystack.push(15);
        mystack.push(14);
        mystack.push(12);
        mystack.push(12);
        mystack.push(127);
        mystack.push(125);
        mystack.push(172);
        mystack.push(1132);
        mystack.push(1288);
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.print();
    }
}
