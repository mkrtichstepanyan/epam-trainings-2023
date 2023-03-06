package homework_10.Hovhannes_Gspeyan.chapter_10;

public class ThrowDemo {
    static void demoProc(){
        try{
            throw new NullPointerException("demo");
        }catch (NullPointerException e){
            System.out.println("Caught inside demo Proc ");
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            demoProc();
        }catch (NullPointerException e){
            System.out.println("recaught: " + e);
        }
    }
}
