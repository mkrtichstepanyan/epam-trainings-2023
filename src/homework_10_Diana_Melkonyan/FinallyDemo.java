package homework_10_Diana_Melkonyan;

public class FinallyDemo {
    //Throw an exception out of yhe method.
    static void procA(){
        try {
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        }finally {
            System.out.println("procA's finally");
        }
    }

    //Return from within a try block.
    static void procB(){
        try {
            System.out.println("inside procB");
            return;
        }finally {
            System.out.println("procB's finally");
        }
    }
    static void procC(){
        try {
            System.out.println("inside procC");
        }finally {
            System.out.println("procC's finally");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }catch (Exception e){
            System.out.println("Excepption caught");
        }
        procB();
        procC();
    }

}
