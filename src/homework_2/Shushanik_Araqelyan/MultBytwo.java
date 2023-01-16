package homework_2.Shushanik_Araqelyan;

public class MultBytwo {
public static void main(String[] args) {
    int i;
    int num = 0xFFFFFFE ;
    for (i = 0; i < 4; i++) {
        num = num << 1;
        System.out.println(num);
    }
}
}
