package homework_10.Varsik_Pijoyan.chapter_10;

public class ThrowDemo {
    public static void demoProc(){
        try {
            throw new NullPointerException("demo");
        }catch (NullPointerException e){
            System.out.println("Caught inside demoProc.");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoProc();
        }catch (NullPointerException e){
            System.out.println("Recaught: " + e);
        }
    }
}
