package homework_2.Levon_Harutyunyan;

public class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;
//        System.out.println(num);
        for (i = 0; i < 4; i++){
            num = num << 1;
            System.out.println(num);
        }
    }
}
