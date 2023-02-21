package homework_4.Alina_Vardanovna.chapter7;

public class CallByValueDemo {

    public static void main(String[] args) {

        CallByValue ob = new CallByValue();
        int a = 15;
        int b = 20;
        System.out.println("Մինչև a ու b կանչելը: " + a + ", " + b);

        ob.meth(a, b);
        System.out.println("a ու b կանչելուց հետո: " + a + ", " + b);


    }
}
