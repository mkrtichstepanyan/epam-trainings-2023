package homework_6.Araksya_Ghazaryan.chapter_8;

public class B3 extends A3 {
    int k;
    B3(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show (){
        System.out.println("k: " + k);
    }
}