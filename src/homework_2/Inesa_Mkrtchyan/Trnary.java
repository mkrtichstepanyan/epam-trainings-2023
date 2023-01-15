package Inesa_Mkrtchyan;

public class Trnary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.print("Absoulte vlue of ");
        System.out.println(i + " is " + k);
        i = -10;
        k = i < 0 ? -i : i;
        System.out.print("Absoulte vlue of ");
        System.out.println(i + " is " + k);
    }
}
