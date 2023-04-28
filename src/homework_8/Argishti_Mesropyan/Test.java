package homework_8.Argishti_Mesropyan;

public class Test {
    public static void main(String[] args) {
        int number = 8;
        myMethod(2);

    }

    public static void myMethod(int bool) {
        if (bool == 128) {
            return;
        }

        System.out.println(bool);
        myMethod(bool * 2);
    }
}
