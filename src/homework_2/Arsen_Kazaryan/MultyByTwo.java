package homework_2.Arsen_Kazaryan;

public class MultyByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFFE;
        for(i=0; i<4; i++){
            num = num << 1;
            System.out.println(num);
        }
    }
}
