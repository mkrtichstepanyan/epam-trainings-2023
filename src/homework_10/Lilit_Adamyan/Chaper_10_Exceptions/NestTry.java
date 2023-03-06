package homework_10.Lilit_Adamyan.Chaper_10_Exceptions;

public class NestTry {
    public static void main(String[] args) {
      try{
          int a = args.length;
          int b = 42/0;
          System.out.println("a = " + a);
     try{
          if(a == 1){
              a = a/(a-a);
          }
         if (a == 2) {
             int[] c= {1};
             c[42]= 99;
         }
        }catch (ArrayIndexOutOfBoundsException e){
         System.out.println("Array index out of bounds" + e);
     }
      }catch (ArithmeticException e){
          System.out.println("Divide by zero " + e);
      }
    }
}
