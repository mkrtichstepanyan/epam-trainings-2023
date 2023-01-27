package homework_1.Liana_Gevorgyan;

public class DynInit {
    //demonstrate dynamic initialisation
    public static void main( String args[]){

        double a = 3.0, b=4.0;
        //c is dynamically initialized
        double c =Math.sqrt(a*a+ b*b);
        System.out.println("Hypotenuse is " + c);
    }
}
