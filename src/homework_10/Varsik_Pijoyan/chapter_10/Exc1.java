package homework_10.Varsik_Pijoyan.chapter_10;

public class Exc1 {
    public static void subroutine() {
        int d = 0;
        int a = 10 / d; //Arithmetic exception
    }

    public static void main(String[] args) {
        Exc1.subroutine();
    }
}
