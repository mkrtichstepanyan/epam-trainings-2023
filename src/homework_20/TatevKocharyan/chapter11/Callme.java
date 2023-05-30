package homework_20.TatevKocharyan.chapter11;

public class Callme {
   synchronized void call(String msg){
        System.out.print("["+msg);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
        System.out.println("]");
    }
}
