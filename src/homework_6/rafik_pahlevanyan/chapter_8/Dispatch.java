package homework_6.rafik_pahlevanyan.chapter_8;

public class Dispatch {
    public static void main(String[] args) {


        A6 a6 = new A6();   //object of type A6
        B6 b6 = new B6();   //object of type B6
        C6 c6 = new C6();   //object of type C6

        A6 r;   //obtain a reference of type A6

        r = a6; //r refers to an A6 object
        r.callme(); //calls A6`s version of callme

        r = b6; //r refers to an B6 object
        r.callme(); //calls B6`s version of callme

        r = c6; //r refers to an C6 object
        r.callme(); //calls C6`s version of callme
    }
}