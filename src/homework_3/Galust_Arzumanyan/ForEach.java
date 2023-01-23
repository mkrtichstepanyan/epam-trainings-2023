package homework_3.Galust_Arzumanyan;


// This method is used to demonstrate for-each style for loop
public class ForEach {
    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int sum = 0;

        // use for-each style for to display and sum the values
        for ( int x : num ) {
            System.out.println(" Value is " + x);
            sum += x;
        }
        System.out.println("Summation: " + sum);
    }
}
