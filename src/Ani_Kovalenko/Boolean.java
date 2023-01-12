package Ani_Kovalenko;

public class Boolean {
    public static void main(String [] args){
        boolean b;
        b = true;
        System.out.println("The statement is " + b);
        b = false;
        System.out.println ("The statement now is " + b);
        if (b) System.out.println ("Don't print");
        b = true;
        if (b) System.out.println ("Print this statement, because the statement is true");
        System.out.println("4>2 = " + (4>2));
    }
}
