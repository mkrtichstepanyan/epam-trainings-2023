
package homework_4.Eduard_Eghiazaryan.Chapter_6;


import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        java.util.Stack mystack1 = new java.util.Stack();
        java.util.Stack mystack2 = new Stack();

        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());

    }
}
