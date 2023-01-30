package homework_3.Liana_Gevorgyan.ControlStatements;
//Use break with a for-each style for
public class ForEach2 {
    public static void main(String args[]){
        int sum=0;
        int num[]={1,2,3,4,5,6,7,8,9,10};
        //use for to display and sum the values
        for (int x : num) {
            System.out.println("value is: " + x);
            sum+=x;
            if (x==5) break; //stop the loop when 5 is obtained

        }
        System.out.println("Summation of first 5 elements: " + sum);
    }
}
