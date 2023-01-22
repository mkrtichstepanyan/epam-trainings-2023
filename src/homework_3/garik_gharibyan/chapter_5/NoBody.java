package homework_3.garik_gharibyan.chapter_5;

public class NoBody {
    public static void main(String[] args) {
        int i = 100;
        int j = 200;

        while (++i < --j);

        System.out.println("Midpoint is " + i);

    }
}
