package homework_10.Lilit_Adamyan.Chaper_10_Exceptions;

public class ThrowDemo {
    static void demoproc(){
        try{
            throw  new NullPointerException("demo");
        }catch (NullPointerException e){
            System.out.println("Caught inside demoProc.");
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch (NullPointerException e){
            System.out.println("Recaught: " + e);
        }
    }
}
