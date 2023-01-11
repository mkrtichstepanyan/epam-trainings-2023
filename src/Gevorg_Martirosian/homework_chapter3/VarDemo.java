//simple demonstration of local variables
public class VarDemo {
    public static void main(String[] args) {
        //in this case var is a type of variable, it will be double
        var avg = 10.0;
        System.out.println("value of avg: " + avg);

        //in this case var is just a name of variable
        int var = 1;
        System.out.println("value of var: " + var);

        //in this case var is used like a type of variable and like a name of variable
        var k = -var;
        System.out.println("value of k: " + k);
    }
}
