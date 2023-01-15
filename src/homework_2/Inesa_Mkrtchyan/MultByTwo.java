package homework_2.Inesa_Mkrtchyan;

public class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xffffffe;
        for(i = 0; i < 4; i++){
            // num = num << 1;
            num <<= 1;
            System.out.println(num);
        }
    }
}
