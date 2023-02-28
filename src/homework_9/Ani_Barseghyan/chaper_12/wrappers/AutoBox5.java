package homework_9.Ani_Barseghyan.chaper_12.wrappers;

public class AutoBox5 {
    public static void main(String[] args) {
        Boolean b = true;

        if (b) {
            System.out.println("b is true");
        }

        Character ch = 'x';
        char ch2 = ch;
        System.out.println("ch2 is " + ch);
    }
}
