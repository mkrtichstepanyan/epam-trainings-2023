package homework_2.Eduard_Eghiazaryan;

public class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFE;
        for (i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);

        }
    }
}
