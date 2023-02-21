package homework_6.Inesa_Mkrtchyan.Chapter_8;

class Dispatch {
    public static void main(String args[]) {
        A7 a = new A7();
        B7 b = new B7();
        C7 c = new C7();
        A7 r;
        r = a;
        r.callme();
        r = b;
        r.callme();
        r = c;
        r.callme();
    }
}
