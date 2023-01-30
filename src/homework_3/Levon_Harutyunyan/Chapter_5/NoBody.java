package homework_3.Levon_Harutyunyan.Chapter_5;

public class NoBody {
    public static void main(String[] args) {
        int i = 100;
        int j = 200;
        while (++i < --j){
            System.out.println(i + " and " + j);
        } // no body in this loop
        System.out.println("\nMidpoint is " + i);
    }
}
