package homework_6.rafik_pahlevanyan.chapter_8;

public class Override1 {
    public static void main(String[] args) {
        B5 subOb = new B5(1, 2, 3);
        subOb.show("This is k: ");  //this calls show()in B5
        subOb.show();//this calls show() in A5
    }
}