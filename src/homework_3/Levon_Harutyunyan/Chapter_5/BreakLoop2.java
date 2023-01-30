package homework_3.Levon_Harutyunyan.Chapter_5;

public class BreakLoop2 {
    public static void main(String[] args) {
        int x = 0;
        while (x < 100){
            if ( x == 10){
                break;
            }
            System.out.println("x: " + x);
            x++;
        }
        System.out.println("Loop complete");
    }
}
