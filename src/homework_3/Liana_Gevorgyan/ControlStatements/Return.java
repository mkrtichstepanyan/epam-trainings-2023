package homework_3.Liana_Gevorgyan.ControlStatements;
//Demonstrate return
public class Return {
    public static void main(String args[]) {
        boolean t = true;
        System.out.println("Before the return.");
        if(t) return; // return to caller
        System.out.println("This won't execute.");
    }

}
