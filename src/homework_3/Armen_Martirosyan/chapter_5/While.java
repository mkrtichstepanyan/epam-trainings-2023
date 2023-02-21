package homework_3.Armen_Martirosyan.chapter_5;

public class While {
    public static void main(String[] args) {
        int n = 10;

        while (n > 0) {
            System.out.println("tick " + n);
            n--;
        }

        int i = 100;
        int j = 200;

        while (++i < --j) {
            System.out.println("Midpoint is " + i);
        }

    }
}
