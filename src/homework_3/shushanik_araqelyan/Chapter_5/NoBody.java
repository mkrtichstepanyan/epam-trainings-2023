package homework_3.shushanik_araqelyan.Chapter_5;

public class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;
        // find midpoint between i and j
        while (++i < --j) ; // no body in this loop
        System.out.println("midpoint i " + i);
    }
}
