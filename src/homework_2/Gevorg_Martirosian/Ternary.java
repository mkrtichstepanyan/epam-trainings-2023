package homework_2.Gevorg_Martirosian;

//demonstration of ternary operation
public class Ternary {
    public static void main(String[] args) {
        int i;
        int k;

        i = 10;
        k = i < 0 ? -i : i; //get an absolute value of i
        System.out.println("absolute value of " + i + " equals " + k);

        i = - 10;
        k = i < 0 ? -i : i; //get an absolute value of i
        System.out.println("absolute value of " + i + " equals " + k);
    }
}
