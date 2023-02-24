package homework_8.gohar_hakobyan;

public class IfTest3 {
    public static void main(String[] args) {
        IntStack mystack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(5);
        mystack = ds;
        for (int i = 0; i < 12; i++) {
            mystack.push(i);
        }
        mystack = ds;
        for (int i = 0; i < 8; i++) {
            mystack.push(i);
        }
        mystack = ds;
        for (int i = 0; i < 12; i++) {
            System.out.println(mystack.pop());
        }
        mystack = fs;
        for (int i = 0; i < 8; i++) {
            System.out.println(mystack.pop());
        }

    }
}