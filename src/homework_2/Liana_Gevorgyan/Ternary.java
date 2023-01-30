package homework_2.Liana_Gevorgyan;
//demonstrate ?
public class Ternary {
    public static void main (String args[]){
        int i, k;
        i=10;
        k= i< 0 ? -i: i; //get absolute value of i
        System.out.println("Absolute value of ");
        System.out.println(i + " is " + k);
        i=-10;
        k=i<0? -i: i; //get absolute value of i

        System.out.println("Absolute value of ");
        System.out.println(i + " is " + k);

    }
}
