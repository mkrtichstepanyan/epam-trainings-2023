package homework_2.garik_gharibyan;

public class MultByTwo {
    public static void main(String[] args) {
        int num = 0xffffffe;
        int i;

        System.out.println(num + "\n");

        for (i = 0; i < 7; i++){
            num = num << 1;
            System.out.println(num);

        }

    }
}
