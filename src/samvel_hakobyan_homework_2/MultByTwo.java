package samvel_hakobyan_homework_2;

public class MultByTwo {
    public static void main(String[] args) {

        int i;
        int num = 0xFFFFFFF;
        for (i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}
