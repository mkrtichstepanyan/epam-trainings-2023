package homework_3.Sofya_Ghazaryan.chepter_5;

public class NoBody {
    public static void main(String[] args) {
        int i, j;

        i = 100;
        j = 200;

        while (++i < --j) ; //no body in this loop
        System.out.println("Midpoint is " + i);
    }
}
