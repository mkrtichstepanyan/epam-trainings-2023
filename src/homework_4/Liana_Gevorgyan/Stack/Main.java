package homework_4.Liana_Gevorgyan.Stack;

public class Main {
    public static void main(String[] args) {
        Stack testStack= new Stack(5);
        testStack.pop();
        testStack.push(3);
        testStack.push(25);
        testStack.push(35);
        testStack.push(530);
        testStack.push(305);
        testStack.push(350);
        testStack.push(5);
        testStack.push(34);

        for(int i=0; i<10; i++){
            System.out.println("Poping value  " + i +" : " + testStack.pop()) ;
        }
    }
}
