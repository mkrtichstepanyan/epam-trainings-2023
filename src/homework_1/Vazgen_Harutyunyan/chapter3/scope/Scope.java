package homework_1.Vazgen_Harutyunyan.chapter3.scope;

public class Scope {
    public static void main(String[] args) {
        int x;

        x = 10;
        if (x==10){
            int y = 20;
            System.out.println("x and y: " + x +" " + y);
            x = y * 2;
        }
        System.out.println("x is " +x);
    }
}
