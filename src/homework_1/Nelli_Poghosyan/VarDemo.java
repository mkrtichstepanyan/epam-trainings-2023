package homework_1.Nelli_Poghosyan;

//A simple demo of local variable type inference
public class VarDemo {
    public static void main(String[] args) {
        var avg = 10.0;
        System.out.println("Value of avg: " + avg);

        int var = 1;
        System.out.println("Value of var: " + var);

        var k = - var;
        System.out.println("Value of k: " +k);
    }
}
