package homework_6.Nona_Asatryan.chapter8;

public class A5B6Override {
    public static void main(String[] args) {
        B6 subOb = new B6(1, 2, 3);

        subOb.show("This is k: ");      //this calls show() in B6
        subOb.show();       //this calls show() in A5
    }

}
