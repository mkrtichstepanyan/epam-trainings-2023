package homework_3.Robert_Nazaryan.chapter_5;

//Using the comma
public class Comma {

    public static void main(String[] args) {

        int a, b;
        for (a = 0, b = 4; a < b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
