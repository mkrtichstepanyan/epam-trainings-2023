package homework_3.gevorg_arghushyan.chapter_5;

public class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;
        while (++i < --j);
        System.out.println("The middle point is " + j + ".");
    }
}
