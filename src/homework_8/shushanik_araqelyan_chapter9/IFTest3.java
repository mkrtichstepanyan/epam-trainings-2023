package homework_8.shushanik_araqelyan_chapter9;

public class IFTest3 {
    public static void main(String[] args) {
        FixedStack mystack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);
       // mystack = ds;
       // for (int i = 0; i <12 ; i++) mystack.push(i);
        mystack = fs;
        for (int i = 0; i < 8; i++) mystack.push(i);
        //mystack = ds;
        System.out.println("Values in dinamic stack :");
        for (int i = 0; i < 12; i++)
        System.out.println( mystack.pop());
        mystack=fs;
        System.out.println("Values in fixed stack :");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack.pop());







        }
    }


