package homework_1.Liana_Gevorgyan;

public class Scope {
    public static void main(String args[]){
        int x;//known to all scope
        x=10;
        if(x==10){//Start new scope
          int y=20; //known only to this block
          //x qnd y  both know here
            System.out.println("x and y " + x + " "+ y);
            x=y*2;
        }
       // y=100 //error! y not know here
        // x is still know here
        System.out.println("x is "+x);
    }
}
