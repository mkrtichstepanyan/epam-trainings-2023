package homework_6.Nona_Asatryan.chapter8;

public class Dispatch {
    public static void main(String[] args) {
        DispatchA a = new DispatchA();
        DispatchB b = new DispatchB();
        DispatchC c = new DispatchC();

        DispatchA r;    //obtain a reference of type DispatchA

        r = a;     // r refers to a DispatchA object
        r.callme();   // calls DispatchA's version of callme

        r = b;      // r refers to a DispatchB object
        r.callme();    // calls DispatchB's version of callme

        r = c;        // r refers to DispatchC object
        r.callme();    // calls DispatchC's version of callme
    }
}
