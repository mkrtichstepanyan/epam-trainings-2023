package homework_3.Liana_Gevorgyan.ControlStatements;

public class ForEach {
    public static void main (String args[]){
        int num[] = {1,2,3,4,5,6,7,8,9,10};
        int sum =0;
        //use for-each style for to display and sum the values
        for (int x: num){
            System.out.println("Value is: " + x);
            sum +=x;
        }
        System.out.println("Summation: "  + sum);
    }
}
