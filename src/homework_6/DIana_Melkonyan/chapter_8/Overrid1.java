package homework_6.DIana_Melkonyan.chapter_8;

public class Overrid1 extends Overrid {
    int k;

    Overrid1(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    //display k -this overrides show() in Overrid
    void show(){
        super.show();
        System.out.println("k: " + k);
    }
    void show(String msg){
        System.out.println(msg + k);
    }
}
