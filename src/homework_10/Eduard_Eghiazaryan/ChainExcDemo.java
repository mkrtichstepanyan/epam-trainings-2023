package homework_10.Eduard_Eghiazaryan;

public class ChainExcDemo {
    static void demoProc() {

        NullPointerException expetion = new NullPointerException("top layer");

        expetion.initCause(new ArithmeticException("couse"));

        throw expetion;
    }

    public static void main(String[] args) {
        try{
            demoProc();
        }catch (NullPointerException exception){
            System.out.println("Cought " + exception);

            System.out.println("Original couse: " + exception.getCause());
        }
    }
}

