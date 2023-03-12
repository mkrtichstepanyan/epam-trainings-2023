package homework_9.Radik_manasyan.chapter12;

public class AutoBox5 {
    public static void main(String[] args) {
        Boolean b = true;

        if (b) {
            System.out.println("b равно true");
        }

        Character ch = 'x';
        char ch2 = ch;

        System.out.println("ch2 равно " + ch2);
    }
}
