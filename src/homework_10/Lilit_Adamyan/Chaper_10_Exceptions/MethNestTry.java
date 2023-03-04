package homework_10.Lilit_Adamyan.Chaper_10_Exceptions;

public class MethNestTry {
    static void nestTry(int a ){
        try{
            if (a == 1) {
                a = a/(a-a);
            }if(a == 2){
                int[]c = {1};
                c[42] = 99;
                }
            }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bounds " + e);
        }
    }
    public static void main(String[] args) {
        try{
            int a = args.length;
            int b = 42/a;
            System.out.println("a = " + a);
            nestTry(a);
;;        }catch (ArithmeticException e){
            System.out.println("Divide by zero  " + e);
        }
    }
}
