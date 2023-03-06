package homework_10.Lilit_Adamyan.Chaper_10_Exceptions;

import java.util.Random;

public class HandlerError {
    public static void main(String[] args) {
        int a = 0,b=0, c= 0;
        Random  random = new Random();
        try{
            b = random.nextInt();
            c= random.nextInt();
            a = 1234/(b/c);
        }catch (ArithmeticException e){
            System.out.println("Division by zero.");
             a = 0;
        }
        System.out.println("a: " + a);

    }
}
