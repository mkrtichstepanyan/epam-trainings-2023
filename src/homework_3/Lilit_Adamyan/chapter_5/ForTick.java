package homework_3.Lilit_Adamyan.chapter_5;

public class ForTick {
    public static void main(String[] args) {
        int n;

        for (n = 10; n > 0; n--) {
            System.out.println("tick " + n);
        }

        System.out.println("________________");
        //here,n is declared inside of the for loop
        for (int i = 10; i > 0; i--) {
            System.out.println("local " + i);

        }
    }
}
