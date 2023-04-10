package homework_10.Eduard_Eghiazaryan;

public class FinallyDemo {
    static void procA(){

        try {
            System.out.println("inside procA");
            throw new RuntimeException("Demo");

        } finally {
            System.out.println("procA is finally");
        }
    }

    static void procB() {

        try {
            System.out.println("inside procB");
            return;
        }finally {
            System.out.println("procB is finally");
        }
    }

    static void procC() {
        try {
            System.out.println("inside procC");
        } finally {
            System.out.println("procC is finally");
        }
    }


    public static void main(String[] args) {

        try {
            procA();
        } catch (Exception exeption){
            System.out.println("Exception caught");
        }
        procB();
        procC();
    }
}
